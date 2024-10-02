import java.util.*;
class unionOfSortedArray{
    public static void main(String [] args){
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        // ################## BRUTE FORCE ################
        Set<Integer> union= new TreeSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int n:arr1){
            union.add(n);
        }
        for(int n:arr2){
            union.add(n);
        }
        for(Integer n:union){
            ans.add(n);
        }
        for(Integer n:ans){
            System.out.print(n+" ");
        }
    }
}