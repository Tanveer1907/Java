public class diagonal_matrix {
    public static void main(String[] args){
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int product = 1;
        for(int i = 0;i<matrix.length;i++){
            product*=matrix[i][i];
        }
        System.out.println(product);
    }
}
