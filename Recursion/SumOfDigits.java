package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int sum=sum(n);
        System.out.println("Sum of digits is: "+sum);

    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
}
