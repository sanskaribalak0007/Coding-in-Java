import java.util.Scanner;

public class productfun {

    public static int calculateproduct(int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();

        int result=calculateproduct(a, b);
        System.out.println("Total product is: "+result);
    }
}
