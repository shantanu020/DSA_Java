package Recursion;

public class PrintingOfMultiple {
    // printing of multiples or table
    public static void main(String[] args) {
        int n=24;
        int k=5;
        print(n, k);
    }
    public static void print(int n,int k){
        if(k==0){
            return;
        }
        print(n, k-1);
        System.out.println(n*k);
    }
}
