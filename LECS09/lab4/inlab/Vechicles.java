// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class AutoMobile {
    public String make, yearandModel;
    float milage;
    double price;

    void display() {
        System.out.println("make = " + make);
        System.out.println("Year/Model =" + yearandModel);
        System.out.println("milage =" + milage);
        System.out.println("price =" + price);
    }
}

class Cars extends AutoMobile {
    Cars(String m, String yam, float mi, double p) {
        super.make = m;
        super.yearandModel = yam;
        super.milage = mi;
        super.price = p;
    }
}

class Trucks extends AutoMobile {
    Trucks(String m, String yam, float mi, double p) {
        super.make = m;
        super.yearandModel = yam;
        super.milage = mi;
        super.price = p;
    }
}

class Vans extends AutoMobile {
    Vans(String m, String yam, float mi, double p) {
        super.make = m;
        super.yearandModel = yam;
        super.milage = mi;
        super.price = p;
    }
}

class Vechicles {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: 1. Car, 2. Van, 3. Truck");
            int k = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            String m, yam;
            float mi;
            double p;
            int d;
            switch (k) {
                case 1:
                    System.out.println("Enter the details of car like make, year/model, milage, price");
                    m = sc.nextLine();
                    yam = sc.nextLine();
                    mi = sc.nextFloat();

                    p = sc.nextDouble();

                    d = Integer.parseInt(yam.substring(0, 4));
                    if (d >= 2000 && d <= 2030) {
                        Cars c = new Cars(m, yam, mi, p);
                        c.display();
                    }
                    break;
                case 2:
                    System.out.println("Enter the details of Truck like make, year/model, milage, price");
                    m = sc.nextLine();
                    yam = sc.nextLine();
                    mi = sc.nextFloat();

                    p = sc.nextDouble();

                    d = Integer.parseInt(yam.substring(0, 4));
                    if (d >= 2000 && d <= 2030) {
                        Trucks t = new Trucks(m, yam, mi, p);
                        t.display();
                    }
                    break;
                case 3:
                    System.out.println("Enter the details of car like make, year/model, milage, price");
                    m = sc.nextLine();
                    yam = sc.nextLine();
                    mi = sc.nextFloat();

                    p = sc.nextDouble();

                    d = Integer.parseInt(yam.substring(0, 4));
                    if (d >= 2000 && d <= 2030) {
                        Vans c = new Vans(m, yam, mi, p);
                        c.display();
                    }
                    break;
                default:
                    System.out.println("Entered wrong input");
            }
        } catch (Exception e) {
            System.out.println(
                    "Invalid Input parameter for Year/Model [since first four characters in the range of 2000-2030]");
        }
    }
}
