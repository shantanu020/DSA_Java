package Recursion;

public class PowerOfNum {
    public static void main(String[] args) {
        int n=2;
        int k=46;
        System.out.println(power(n, k));
        System.out.println(powerBetter(n, k));
    }
    // Brute 
    public static int power(int n,int k){
        if(k==0){
            return 1;
        }
        return n*power(n,k-1);
    }
    // better using divide and conquere : 2^64=2^32*2^32; (reducing number of function call)

    public static long powerBetter(int n,int k){
        if(k==0){
            return 1;
        }
        long result= powerBetter(n, k/2);
        if(k%2==0){
            return result*result;
        }else{
            return n*result*result;
        }
        
    }
    
}
