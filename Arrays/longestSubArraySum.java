// import java.util.*;
public class longestSubArraySum {
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int n=10;
        int k=3;
        int len=0;
        int sum=0;
        // brute
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             len=Math.max(len,j-i+1);
        //         }
        //     }
        // }

        // better(using hashing)- if array contains negative integers then this is best approach
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     sum+=arr[i];
        //     if(sum==k){
        //         len=i+1;
        //     }
        //     if(map.containsKey(sum-k)){
        //         len=Math.max(len,i-map.get(sum-k));
        //     }
        //     map.putIfAbsent(sum,i);
        // }
        

        // Best Sliding window and two pointer
        int j=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>k&&j<=i){
                sum=sum-arr[j++];
            }
            if(sum==k){
                len=Math.max(len,i-j+1);
            }
        }
        System.out.println("Longest subarray: "+len);
    }
}
