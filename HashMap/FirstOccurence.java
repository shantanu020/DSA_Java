package HashMap;

import java.util.HashMap;

public class FirstOccurence {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        String str="INDIA";
        // for(int i=0;i<str.length();i++){
        //     if(map.containsKey(str.charAt(i))){
        //         map.put(str.charAt(i),map.get(str.charAt(i))+1);
        //     }else{
        //         map.put(str.charAt(i),1);
        //     }
        // }
        // we can also achieve above functionality by
        for(int i=0;i<str.length();i++){
            int cnt=map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), cnt+1);
        }
        int result=-1;

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("First occurrence of non-repeating element is found at index: "+i);
                result=1;
                break;
            }
        }
        if(result==-1){
            System.out.println("No non-repeating character present in the array");
        }
    }    
}
