package Number;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n=101;
        int dec=0;
        int i=0;
        while(n>0){
            int dig=n%10;
            dec=(int) (dec + dig*Math.pow(2,i++));
            n=n/10;
        }
        System.out.println("DECIMAL: "+dec);
    }
    
}
