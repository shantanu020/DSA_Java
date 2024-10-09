package Searching;
public class Binary{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=6;
        int low=0;
        int high=5;
        int key=5;
        int indx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                indx=mid;
                break;
            }else if(arr[mid]>key){
                high=mid-1;
            }else if(arr[mid]<key){
                low=mid+1;
            }
        }
        System.out.println(indx +":"+key);
    }
}
// Array must be sorted 
// TC: O(logn)