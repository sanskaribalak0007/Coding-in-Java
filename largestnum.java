
public class largestnum {
     public static int Largestnum(int myArray[]){
        int largest=Integer.MIN_VALUE;
        int lowest=Integer.MAX_VALUE;
       for(int i=0;i<myArray.length;i++){
        if(largest<myArray[i]){
            largest=myArray[i];
        }
        if(lowest>myArray[i]){
         lowest=myArray[i];
        }
       }
       System.out.println("smallest "+lowest);
       return largest;
     }
    public static void main(String[] args) {
        int myArray[]={1,2,3,-1,5,6,20,8,9,10};
        int LargeNumber = Largestnum(myArray);
        System.out.println("Largest number is "+LargeNumber+".");
    }
}
