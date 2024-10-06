public class alternateNumbers {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        arr=brute(arr, n);
        System.out.println("BRUTE RESULT");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        arr=optimal(arr, n);
        System.out.println();
        System.out.println("OPTIMAL RESULT");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] brute(int []arr,int n){
        int pos[]=new int[n/2+1];
        int neg[]=new int[n/2+1];
        int p=0;
        int ne=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos[p++]=arr[i];
            }else{
                neg[ne++]=arr[i];
            }
        }
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];
        }
        return arr;
    }
    public static int[] optimal(int arr[],int n){
        int ans[]=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[pos]=arr[i];
                pos+=2;
            }else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
}
