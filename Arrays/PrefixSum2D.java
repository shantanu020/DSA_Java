public class PrefixSum2D {
    public static void main(String[] args) {
        int arr[][]={{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int m1=1;
        int m2=2;
        int n1=1;
        int n2=2;
        int sum=0;
        for(int i=m1;i<=m2;i++){
            for(int j=n1;j<=n2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        prefixSum2D(arr);
    }
    public static void prefixSum2D(int [][] arr){
        int n=arr.length;
        int preSum[][]=new int[n+1][n+1];
        int r1=0;
        int r2=4;
        int c1=0;
        int c2=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                preSum[i][j]=arr[i-1][j-1]+preSum[i-1][j] 
                +preSum[i][j-1]
                -preSum[i-1][j-1];
                
            }
        }
        int sum=preSum[r2+1][c2+1]-preSum[r1-1][c2]-preSum[r2][c1-1]+preSum[r1][c1];
        System.out.println("Sum: "+sum);
    }
}
// TC:(m*n) Thus the above approach is only feasible for less number of queries.
// for large number of queries for example 10^5 the TC will be O(10^5*m*n)
// which is very very huge so we must follow some better approach (concept of prefix sum) for large number of queries.

// arr =|1,1,1,1,1|
//      |1,1,1,1,1|
//      |1,1,1,1,1|
//      |1,1,1,1,1|
//      |1,1,1,1,1|

// preSum =|0,0,0,0,0,0|
//         |0,1,1,1,1,1|
//         |0,1,1,1,1,1|
//         |0,1,1,1,1,1|
//         |0,1,1,1,1,1|
//         |0,1,1,1,1,1|
// to handle edge case condition we have added an extra row and column initialized with zero