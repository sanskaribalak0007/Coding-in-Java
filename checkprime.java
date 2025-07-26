public class checkprime {

    // public static void checkprime1(int n){
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             System.out.println("The given number is not prime.");
    //             break;
    //         }   
    //         else{
    //            System.out.println("The given number is prime");
    //            break;
    //         }
    //     }

    // }

    public static boolean checkprime1(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkprime1(7));
    }
}
