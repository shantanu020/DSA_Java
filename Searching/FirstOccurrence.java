package Searching;

public class FirstOccurrence {
    public static void main(String[] args) {
        int arr[]={2,4,7,7,9,9,9};
        int target=7;
        // we have to find the first occurrence of 7
        int low=0;
        int high=arr.length-1;
        int indx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                indx=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(indx+":"+target);
    }
}
