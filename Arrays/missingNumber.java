public class missingNumber {
    public static void main(String [] args){
        int nums[]={1,2,4,5};
        int N=5;
        boolean pres=false;
        int mis=0;
        for(int i=1;i<=nums.length;i++){
            pres=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    pres=true;
                    break;
                }
            }
            if(pres==false){
                mis=i;
                break;
            }
        }
        System.out.println(mis);
    }
    
}
