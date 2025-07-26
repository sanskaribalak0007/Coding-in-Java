public class maxSubArraySum {
    public static void maxSubArraysum(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        // int currsum = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int  currsum=0;
                for(int k=i;k<=j;k++){
                  currsum += numbers[k];
                }
                System.out.println(currsum);
                if(max_sum < currsum){
                    max_sum = currsum;
                }
            }
        }
        System.out.println("The largest sub Array Sum is "+max_sum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxSubArraysum(numbers);
    }
}
