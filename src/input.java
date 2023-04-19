import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Your name is " + name);
        float marks = input.nextFloat();
        System.out.println("Your marks is: " +marks);
    }
}
