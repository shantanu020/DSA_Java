package Recursion;

import java.util.*;

public class Permutations {
    public static void perm(List<List<Integer>> result,ArrayList<Integer> p,int[] arr){
        // is size of the permutation becomes equal to the length of the array then add the p in result and return 
        if(p.size()==arr.length){
            result.add(new ArrayList<Integer>(p));
            return;
        }
        // for each element in array 
        for(int i=0;i<arr.length;i++){
            // if p already contains arr[i] continue;
            if(p.contains(arr[i])){
                continue;
            }
            // add arr[i] in the element 
            p.add(arr[i]);
            // recursive call to add the next elemnt
            perm(result,p,arr);
            // remove the last added element to find all the possible permutations (backtracking)
            p.remove(p.size()-1);
        }
        // return
    }
    public static List<List<Integer>> permute(int [] arr){
        List<List<Integer>> result=new ArrayList<>();
        perm(result,new ArrayList<Integer>(),arr);
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> result=permute(arr);
        for(List<Integer> a:result){
            for(Integer b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
