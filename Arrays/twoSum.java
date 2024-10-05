public class twoSum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int n=5;
        int target=10;
        // Brute force approach TC=O(n*n)
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Index of first element is: "+i+"\n"+"Index of second element is: "+j);
                }
            }
        }
        
    }
}
