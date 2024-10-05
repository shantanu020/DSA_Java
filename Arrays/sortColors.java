public class sortColors {
    public static void main(String[] args) {
        // DUTCH NATIONAL FLAG ALGORITHM (OPTIMAL)
        int arr[]={0,1,1,0,1,2,1,2,0,0,0};
        int n=11;
        int mid=0;
        int low=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                arr[mid]=arr[low];
                arr[low]=0;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }else{
                mid++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
