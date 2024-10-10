package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=6;
        int key= 6;
        int indx=bin(arr,0,n-1,key);
        System.out.println("Element found at  index: "+indx);
    }
    public static int bin(int [] arr,int low,int high,int key){
        if(low>high){
            return-1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            return bin(arr,low,mid-1,key);
        }else{
            return bin(arr,mid+1,high,key);
        }
    }
}
