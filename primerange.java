import java.util.Scanner;

public class primerange {
    public static boolean isprime(int n){
      boolean isprime=true;
      for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
      }
      return true;
    }
    public static void printprime(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the value of n:");
        int n=input.nextInt();
        printprime(n);
    }
}
