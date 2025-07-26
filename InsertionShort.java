public class InsertionShort {

    public static void Insertionshort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
     public static void printarr(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        printarr(arr);
        Insertionshort(arr);
        printarr(arr);
    }
}
