package Recursion;

public class AlternateSum {
    public static void main(String[] args) {
        int n=10;
        int sum=sum(n);
        System.out.println(sum);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return sum(n-1)-n;
        }else{
            return n+sum(n-1);
        }
    }
}
