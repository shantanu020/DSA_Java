package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Result: "+fact(5));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
