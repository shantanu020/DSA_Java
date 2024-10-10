package Recursion;
public class CountWays {
    // counting stairs

    // after evaluating number of ways to count stairs either 1 or 2 at a time we got a series
    // 1,2,3,5,8,13.... which is similar to fibonacci series
    public static void main(String[] args) {
        int n=6;
        int ways=count(n+1);
        System.out.println("Number of ways to count "+n+" stairs: "+ways);
    }   
    public static int count(int n){
        if(n==0||n==1){
            return n;
        }
        return count(n-1)+count(n-2);
    }
}
// TC: O(2^n)  Naive Recursion  {Exponential Time Complexity}