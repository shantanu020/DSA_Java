package Recursion;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        rev(arr,l,r);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int []arr,int l,int r){
        if(l>=r){
            return;
        }
        swap(arr,l,r);
        rev(arr,l+1,r-1);
    }
    public static void swap(int [] arr,int l, int r){
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
    }   
}
// TC: O(N)
// SC: O(N) {Recursion Stack Space}