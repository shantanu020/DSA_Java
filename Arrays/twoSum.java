import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int n=5;
        int target=10;
        // Brute force approach TC=O(n*n)
        // for (int i = 0; i < arr.length; i++) {
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println("Index of first element is: "+i+"\n"+"Index of second element is: "+j);
        //         }
        //     }
        // }
        
        // better using hashing (Optimal if we have to return indexes)
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(target-arr[i])){
        //         System.out.println("Index of first element is: "+i+"\n"+"Index of second element is: "+map.get(target-arr[i]));
        //     }
        //     map.put(arr[i],i);
        // }

        // Optimal if to return true/false, YES/NO
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println("YES");
                break;
            }else if(arr[i]+arr[j]>target){
                j--;
            }else if (arr[i]+arr[j]<target) {
                i++;
            }else{
                System.out.println("NO");
                break;
            }
        }
    }
}
