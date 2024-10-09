package Number;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n=65;
        StringBuilder bin=new StringBuilder();
        if(n==0){
            bin.append("0");
        }else{
            while(n>0){
                bin.append(n%2);
                n=n/2;
            }
        }
        bin.reverse();
        System.out.println("BINARY: "+bin);
    }
}
