package Recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int sum=0;
        int arr[]={1,2,3,4,5};
        sum=printSum(arr,0);
        System.out.println("Sum: "+sum);
    }
    public static int printSum(int []arr,int i){
        if(i==arr.length){
            return 0;
        }
        return (int)Math.pow(arr[i],3)+printSum(arr,i+1);
    }
}
// TC:O(N)
// SC:O(N) {Internal Stack Space}
// for constant TC and SC use formula for calculating sum of cube of n number which is (n*(n+1)/2)^2;
