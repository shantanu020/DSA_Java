import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
class appearsOnce{
    public static void main(String args[]){
        int arr[]={1,1,2,3,3,4,4};
        int n=arr.length;
        //Brute
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     cnt=0;
        //     for(int j=0;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt==1){
        //         System.out.println("Number that appearsOnce: "+arr[i]);
        //     }
        // }

        // Better 
        // using hash Arrays
        // int hash[]=new int[n+1];
        // for(int i=0;i<n;i++){
        //     hash[arr[i]]++;
        // }
        // for(int i=0;i<n+1;i++){
        //     if(hash[i]==1){
        //         System.out.println("Number that appearsOnce: "+i);
        //     }
        // }

        // using map
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            int val=map.getOrDefault(a, 0);
            map.put(a,val+1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet())
        {
           if(mp.getValue()==1){
            System.out.println("Number that appearsOnce: "+mp.getKey());
           }
        }


    }
}