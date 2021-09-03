import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!
        

        System.out.println("Hi! What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("What is your favorite color?");
        String color = scan.nextLine();
        System.out.println(color + " is a very nice color!");

        System.out.println("What is your biggest fear?");
        String fear = scan.nextLine();
        System.out.println(fear + " is/are very scary indeed.");

        System.out.println("What is your favorite number?");
        int num = scan.nextInt();
        System.out.println(num + " is also my favorite number.");

        System.out.println("How many pets do you have?");
        int numpets = scan.nextInt();
        System.out.println("Wow! " + numpets + " pets is/are amazing!");

        scan.close();
    }
}
