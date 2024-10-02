import java.util.*;
class unionOfSortedArray{
    public static void main(String [] args){
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        // ################## BRUTE FORCE ################
        // Set<Integer> union= new TreeSet<>();
        List<Integer> ans=new ArrayList<>();
        // for(int n:arr1){
        //     union.add(n);
        // }
        // for(int n:arr2){
        //     union.add(n);
        // }
        // for(Integer n:union){
        //     ans.add(n);
        // }
        
        // ################## OPTIMAL ################
        int i=0;
        int j=0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                if(ans.isEmpty()||ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                if(ans.isEmpty()||ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(ans.isEmpty()||ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
             if(ans.isEmpty()||ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        // print ans;
        for(Integer key:ans){
            System.out.print(key+" ");
        }
    }
}