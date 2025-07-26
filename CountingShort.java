public class CountingShort {

    public static void Countingsort(int arr[]){
        int Largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        int count[] = new int[Largest+1];
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i< arr.length; i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
     public static void printarr(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        printarr(arr);
        Countingsort(arr);
        printarr(arr);
    }
}
