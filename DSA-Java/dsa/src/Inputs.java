import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Value :");
        int rollno = input.nextInt();
        System.out.println("Your roll number is "+ rollno);
        System.out.print("Enter String:");
        String name = input.next();
        System.out.println(name);

    }
}
