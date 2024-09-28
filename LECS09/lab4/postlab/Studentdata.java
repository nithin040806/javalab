import java.util.Scanner;
      class Student {
    String name;
    int age;
    String address;
    Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }
     void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
      void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println();
    }
}

public class Studentdata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        Student[] students = new Student[numStudents];
        try {
            for (int i = 0; i < numStudents; i++) {
                students[i] = new Student();  // Initialize each student object
                System.out.println("Enter name, age, and address for student " + (i + 1) + ":");
                String name = scanner.nextLine();
                int age = scanner.nextInt();
                scanner.nextLine();  // Consume newline character
                String address = scanner.nextLine();
                students[i].setInfo(name, age, address);
            }
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Student" + (i + 1) + " Details:");
                students[i].display();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception: Too many students!");
        }
        scanner.close();
    }
}
