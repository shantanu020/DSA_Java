
class Zeroes{
    public static void main(String [] args){
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        // ############################################## Brute force approach 
        // store all the non zero elements in some other array and then restore them at the beg of original array fill the remaining places by zeroes;
        int n=arr.length;
        // int new_arr[]=new int[n];
        // int i=0;
        // for(int num:arr){
        //     if(num!=0){
        //         new_arr[i]=num;
        //         i++;
        //     }
        // }
        // // storing non zeroes at beg
        // int j=0;
        // for(int num:new_arr){
        //     if(i==1){
        //         break;
        //     }
        //     arr[j]=num;
        //     i--;
        //     j++;
        // }
        // // storing zeroes;
        // for(int k=j;k<n;k++){
        //     arr[k]=0;
        // }
        // ############################################# Optimal Solution
        // j will point to the first zero element and i will point to the non zero element  (two pointer approach)
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j<n){
            for(int i=j+1;i<n;i++){
                if(arr[i]!=0){
                    arr[j]=arr[i];
                    arr[i]=0;
                    j++;
                }
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(" "+arr[k]);
        }

    }
}