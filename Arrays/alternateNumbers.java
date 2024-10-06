
import java.util.ArrayList;

public class alternateNumbers {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        int arr1[]={1,2,-4,-5,3,6};
        int n=arr.length;
        int m=arr1.length;
        int []a=brute(arr, n);
        System.out.println("BRUTE RESULT");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        int []b=optimal(arr, n);
        System.out.println();
        System.out.println("OPTIMAL RESULT");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int c[]=varietyII(arr1, m);
        // if number of positive and negative elements are not equal;
        System.out.println("VARIETY 2");
        for (int i = 0; i < m; i++) {
            System.out.print(c[i]+" ");
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

    public static int[] varietyII(int [] arr,int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        if(neg.size()<pos.size()){
            for(int i=0;i<neg.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int indx=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr[indx++]=pos.get(i);
            }
        }else{
            for(int i=0;i<pos.size();i++){
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int indx=pos.size()*2;
            for(int i=pos.size();i<n;i++){
                arr[indx++]=neg.get(i);
            }
        }
        return arr;
    }
}
