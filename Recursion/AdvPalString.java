package Recursion;

public class AdvPalString{
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        String newStr=str.toLowerCase().replaceAll("[^a-z0-9A-Z]", "");
        char arr[]=newStr.toCharArray();
        boolean res=pal(arr,0,arr.length);
        System.out.println(res);
    }
    public static boolean  pal(char []arr,int i,int l){
        if(i>=l/2){
            return true;
        }
        if(arr[i]!=arr[l-i-1]){
            return false;
        }
        return pal(arr,i+1,l);

    }
}