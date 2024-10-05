public class sortColors {
    public static void main(String[] args) {
        // DUTCH NATIONAL FLAG ALGORITHM (OPTIMAL)
        int arr[]={0,1,1,0,1,2,1,2,0,0,0};
        int n=11;
        // int mid=0;
        // int low=0;
        // int high=n-1;
        // while(mid<=high){
        //     if(arr[mid]==0){
        //         arr[mid]=arr[low];
        //         arr[low]=0;
        //         low++;
        //         mid++;
        //     }
        //     else if(arr[mid]==2){
        //         arr[mid]=arr[high];
        //         arr[high]=2;
        //         high--;
        //     }else{
        //         mid++;
        //     }
        // }
        // BRUTE FORCE
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                cnt0++;
            }else if(arr[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        for (int i = 0; i <cnt0; i++) {
            arr[i]=0;
        }
        for (int i = cnt0; i <cnt0+cnt1; i++) {
            arr[i]=1;
        }
        for (int i = cnt0+cnt1; i <n; i++) {
            arr[i]=2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
