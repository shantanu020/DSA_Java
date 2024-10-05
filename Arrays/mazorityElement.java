import java.util.*;

public class mazorityElement {
    public static void main(String[] args) {
        // Brute linear search and cnt , return arr[i] if cnt>n/2

        // Better (use hashing)
        int arr[]={2,2,1,1,1,2,2};
        int n=7;
        HashMap<Integer,Integer> map=new  HashMap<>();
        for(int a:arr){
            int cnt=map.getOrDefault(a, 0);
            map.put(a, cnt+1);
        }
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if(en.getValue()>n/2){
                System.out.println("Mazority Element: "+en.getKey());
            }
        }
    }
}
