package Recursion;
public class Fibonacci {
    public static void main(String[] args) {
       int n =fib(10);
       System.out.println(n);
        
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
// TC: O(2^n)  Naive Recursion  {Exponential Time Complexity}