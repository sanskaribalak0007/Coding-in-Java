import java.util.Scanner;

public class studentpass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Please enter the marks of student = ");
        int marks = input.nextInt();

        String type = ((marks >= 33) ? "PASS" : "FAIL");

        System.out.println("Student marks is " + marks + ".");
        System.out.println("The student will be " + type + ".");
    }
}
