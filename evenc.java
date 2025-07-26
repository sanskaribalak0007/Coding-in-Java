import java.util.Scanner;

public class evenc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("It is even");
        }else{
            System.out.println("It is odd");
        }
    }
}
