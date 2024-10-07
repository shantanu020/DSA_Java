package Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={1,2,3,4,5};
        sum=printSum(arr,sum,0);
        System.out.println("Sum: "+sum);
    }
    public static int printSum(int [] arr,int sum,int i){
        if(i==arr.length){
            return 0;
        }
        return (int)Math.pow(arr[i],3)+printSum(arr,sum,i+1);
    }
}
// TC:O(N)
// SC:O(N) {Internal Stack Space}
