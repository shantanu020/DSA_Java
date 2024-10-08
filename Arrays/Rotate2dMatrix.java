

public class Rotate2dMatrix {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        int row=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ROTATED MATRIX:");
        rotate(matrix,row);
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void rotate(int [][] arr,int row){
        // for rotation of the matrix we must follow 2 steps
        // 1.Find Transpose of the matrix
        // 2.Swap the adjacent columns from begining and last 

        // Transpose;
        for(int i=0;i<row;i++){
            // if j is started with 0 then elements will be swapped twice; 
            for(int j=i;j<row;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        // Rotate
        for(int i=0;i<row;i++){
            for(int j=0;j<row/2;j++){
                int t=arr[i][j];
                arr[i][j]=arr[i][row-1-j];
                arr[i][row-1-j]=t;
            }
        }

    }
}
