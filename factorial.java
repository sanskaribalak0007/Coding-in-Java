public class factorial {

    public static int factorialfind(int a){
        int b=1;
        for(int i=1;i<=a;i++){
          b=b*i;
        }

        return b;
    }
    public static void main(String[] args) {
      int result=  factorialfind(4);
      System.out.println("Factorial is : "+result);
    }
    
}
