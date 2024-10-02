import java.util.*;
public class missingNumber {
    // range [1,N+1]
    public static void main(String [] args){
        int nums[]={1,2,4,5};
        int N=nums.length;
        // ##################### BRUTE ##########################
        int mis=0;
        // boolean pres=false;
        // for(int i=1;i<=nums.length;i++){
        //     pres=false;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==nums[j]){
        //             pres=true;
        //             break;
        //         }
        //     }
        //     if(pres==false){
        //         mis=i;
        //         break;
        //     }
        // }


        // #################################### Better #######################
        // hashing
        // int hash[]=new int[N+1];
        // Arrays.fill(hash,0);
        // for(int i=0;i<N;i++){
        //     if (nums[i] <= N) { 
        //         hash[nums[i]] = 1;  
        //     }
        // }
        // for(int i=0;i<=N;i++){
        //     if(hash[i]==0){
        //         mis=i;
        //     }
        // }

        // #################################### Best ###########################

        // SUM METHOD

        // int sum=(N+1)*(N+2)/2;
        // int numSum=0;
        // for(int i=0;i<N;i++){
        //     numSum+=nums[i];
        // }
        // mis=sum-numSum;
        

        // XOR METHOD

        int x1=0;
        int x2=0;
        for(int i=0;i<N;i++){
            x1=x1^(i+1);
            x2=x2^nums[i];
        }
        mis=x1^x2^(N+1);
        System.out.println(mis);


    }
    
}
