public class bionomialcoefficient {

     public static int factorialfind(int a){
        int b=1;
        for(int i=1;i<=a;i++){
          b=b*i;
        }
        return b;
    }

    public static int binomialcoefficient(int n , int r){
       
         int n_fact= factorialfind(n);
         int r_fact= factorialfind(r);
         int a_fact = factorialfind(n-r);

         int coefficient = n_fact/(r_fact*a_fact);

         return coefficient;
    }
    public static void main(String[] args) {
       System.out.println("coefficient is : "+binomialcoefficient(10, 2)); 
    }
}
