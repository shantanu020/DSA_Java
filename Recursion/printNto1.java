package Recursion;

public class printNto1 {
    public static void main(String[] args) {
        print(10);
        System.out.println("\n By Backtracking");
        printBack(10, 1);

    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    // print by backtracking
    public static void printBack(int n,int i){
        if(i==n+1){
            return;
        }
        printBack(n,i+1);
        System.out.print(i+" ");
    }
}
// TC: O(N)
// SC: O(N) {Internal Stack Space}