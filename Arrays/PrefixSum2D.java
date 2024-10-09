public class PrefixSum2D {
    public static void main(String[] args) {
        int arr[][]={{1,1,1},{1,1,1},{1,1,1}};
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
    }
}
// TC:(m*n) Thus the above approach is only feasible for less number of queries.
// for large number of queries for example 10^5 the TC will be O(10^5*m*n)
// which is very very huge so we must follow some better approach for large number of queries.