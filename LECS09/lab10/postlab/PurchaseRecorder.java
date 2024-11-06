import java.io.*;
import java.util.Scanner;
public class PurchaseRecorder 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        System.out.print("Enter the file name (e.g., Purchases.txt) followed by item details: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length < 4) 
	{
            System.out.println("Invalid input. Please enter the file name, item name, price, and quantity.");
            scanner.close();
            return;
        }
        String fileName = parts[0];
        String itemName = parts[1];
        double price = Double.parseDouble(parts[2]);
        int quantity = Integer.parseInt(parts[3]);
        double cost = price * quantity;
        totalCost += cost;
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) 
	{
            String purchaseDetails = String.format("Item: %s, Price: %.2f, Quantity: %d, Cost: %.2f%n", itemName, price, quantity, cost);
            writer.println(purchaseDetails);
            String totalSummary = String.format("The Total expenditure is Rs. %.0f/-", totalCost);
            System.out.println("Purchases File created: " + totalSummary);
            writer.println(totalSummary);
        } 
	catch (IOException e) 
	{
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } 
	finally 
	{
            scanner.close();
        }
    }
}
