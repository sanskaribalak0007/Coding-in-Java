public class BubbleShort {

    public static void Bubbleshort(int arr[]){
        int n = arr.length;
        for(int turn = 0; turn < n; turn++){
            for(int j = 0; j < n-1-turn; j++ ){
              if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              }
            }
        }
    }

    public static void printarr(int arr[]){
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]= {1,5,4,7,8};
        System.out.print("Before sorting: ");
        printarr(numbers);
        Bubbleshort(numbers);
        System.out.print("After sorting: ");
        printarr(numbers);
    }
}
