public class maxSubArraySum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        System.out.println("MAX SUM via BRUTE: "+brute(arr,n));
        System.out.println("MAX SUM via OPTIMAL: "+kadanesOptimal(arr,n));
        
    }
    public static int brute(int [] arr,int n){
        int sum;
        int maxSum=0;
        for (int i = 0; i < n; i++) {
            sum=0;
            for (int j = i; j < n; j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    public static int kadanesOptimal(int [] arr,int n){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(maxSum<sum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    
}