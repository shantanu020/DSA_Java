package Recursion;
import java.util.*;
public class Combinations {
    public static  void combine(List<List<Integer>>result,ArrayList<Integer>combo,int start,int n,int k){
        if(combo.size()==k){
            result.add(new ArrayList<Integer>(combo));
            return;
        }
        for(int i=start;i<=n;i++){
            // add the element to combo
            combo.add(i);
            // recursive call for next element (element i can only make combination with elements succeeding it)
            combine(result,combo,i+1,n,k);
            combo.remove(combo.size()-1);
        }

    }
    public static void main(String[] args) {
        List<List<Integer>> result=new ArrayList<>();
        int n=4;
        int k=2;
        // to find all the combinations of length 2 for range [1,n];
        combine(result,new ArrayList<Integer>(),1,n,k);
        for(List<Integer> a:result){
            for(Integer b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
