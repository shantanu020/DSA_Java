package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        // if a number if perfect square then print its square root if not then print floor value of square root
        int n=16;
        int low=0;
        int high=n;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n){
                res=mid;
                break;
            }else if(mid*mid<n){
                low=mid+1;
                res=mid;
            }else{
                high=mid-1;
            }
        }
        System.out.println("THE SQUARE ROOT IS: "+res);
    }
}
