public class SelectionShort {

    public static void Selectionshort(int arr[]){
        for(int i=0; i < arr.length-1;i++){
            int minimum = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimum] > arr[j]){
                    minimum = j;
                }
            }
            int temp=arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        PrintArray(numbers);
        Selectionshort(numbers);
        PrintArray(numbers);
    }
    
}
