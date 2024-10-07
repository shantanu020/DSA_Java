package Recursion;

public class print1toN {
    public static void main(String[] args) {
        print(10,1);
        System.out.println("\nBy Backtracking");
        printBack(10, 10);
    }
    public static void print(int n,int i) {
        if(n==0)
        {
            return;
        } 
        System.out.print(i+" ");
        print(n-1,i+1);
    }
    // print by backtracking
    public static void printBack(int n,int i){
        if(i==0){
            return;
        }
        printBack(n, i-1);
        System.out.print(i+" ");
    }
}
// TC: O(N)
// SC: O(N) {Internal Stack Space}
