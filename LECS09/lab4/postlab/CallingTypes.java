import java.util.Scanner;

class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }

}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Undergraduate");
    }

}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }

}

class CallingTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Degree d = new Degree();
        Postgraduate p = new Postgraduate();
        Undergraduate u = new Undergraduate();
        System.out.println(
                "enter your choice \n 1. call print method using each class object \n 2.Call parent class print method using any one of the child class object \n 3.Call any child t class print method using parent class object");
        int k = sc.nextInt();
        try {
            switch (k) {
                case 1:
                    d.getDegree();
                    p.getDegree();
                    u.getDegree();
                    break;
                case 2:
                    d.getDegree();
                    d = new Postgraduate();
                    d.getDegree();

                    break;
                case 3:

                    ((Undergraduate) d).getDegree();

                default:
                    System.out.println("wrong input");

            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
