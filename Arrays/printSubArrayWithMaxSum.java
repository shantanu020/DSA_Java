public class printSubArrayWithMaxSum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        int first=0;
        int ansFirst=0;
        int ansLast=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(sum==0){
                first=i;
            }
            sum+=arr[i];
            if(maxSum<sum){
                maxSum=sum;
                ansFirst=first;
                ansLast=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansFirst;i<=ansLast;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
