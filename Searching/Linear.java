package Searching;

public class Linear {
    public static void main(String[] args) {
        int arr[]={1,3,6,7,9,2};
        int n=6;
        int key=9;
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Index of key is: "+i);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Elemen not found");
        }
    }

}
