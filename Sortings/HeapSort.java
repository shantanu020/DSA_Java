package Sortings;

public class HeapSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=5;
        heapSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void heapSort(int [] arr, int n){
        for(int i=n/2-1;i>=0;i--){
            maxHeapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int t=arr[i];
            arr[i]=arr[0];
            arr[0]=t;
            maxHeapify(arr, i,0);
        }
    }
    public static void maxHeapify(int [] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        while(l<n&&arr[l]>arr[largest]){
            largest=l;
        }
        while(r<n&&arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int t=arr[i];
            arr[i]=arr[largest];
            arr[largest]=t;
            maxHeapify(arr, n, largest);
        }
    }
}
