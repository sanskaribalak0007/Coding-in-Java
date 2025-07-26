import java.util.Scanner;

public class LinearSearch {
   public static boolean LinearSearchf(int myArray[],int key){
    for(int i=0;i<myArray.length;i++){
        if(myArray[i]==key){
            return true;
        }
    }
    return false;
   }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int myArray[]= {1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        
            if(LinearSearchf(myArray, key)){
                System.out.println("Matching found ");
            }
            else{
                System.out.println("Matching not found!");
            }
       
    }
}
