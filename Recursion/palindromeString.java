package Recursion;

public class palindromeString {
    public static void main(String[] args) {
        String s="MADAM";
        boolean ans=pal(s,0);
        System.out.println(ans);
    }
    public static boolean pal(String s,int i){
        if(i>=s.length()-1){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return pal(s,i+1);
    }
}
