package Recursion;
public class printName {
    public static void main(String[] args) {
        String names[]={"Sam","Som","Rimy","Samy"};
        int N=4;
        print(names, N, 0);

    }   
    public static void print(String []names,int N,int i){
        if(N==0){
            return;
        }
        System.out.println(names[i]);
        print(names, N-1, i+1);
    } 
}
