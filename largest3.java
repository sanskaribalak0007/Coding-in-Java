import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = input.nextInt();
        System.out.println("Now, enter the second number");
        int b= input.nextInt();
        System.out.println("enter the third number");
        int c= input.nextInt();

        if(a > b && a > c){
            System.out.println("Largest are A.");
        }
        else if(b > c){
            System.out.println("Largest are B.");
        }
        else{
            System.out.println("Largest is C.");
        }
    }
}
