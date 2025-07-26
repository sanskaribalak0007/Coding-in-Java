import java.util.Scanner;



public class sumfun {

    public static int add(int a,int b){
            return a+b;
        }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
         
        System.out.println("sum is: "+add(a,b));
    }
}
