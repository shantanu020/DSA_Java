package Recursion;

public class print1toN {
    public static void main(String[] args) {
        print(10,1);
    }
    public static void print(int n,int i) {
        if(n==0)
        {
            return;
        } 
        System.out.print(i+" ");
        print(n-1,i+1);
    }
}
// TC: O(N)
// SC: O(N) {Internal Stack Space}
