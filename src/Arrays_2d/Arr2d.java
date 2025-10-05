package Arrays_2d;

public class Arr2d {
    public static void main(String[] args){
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
////        for(int i= 0;i<arr.length;i++){
////            int[] row = arr[i];
////            for(int j = 0;j<row.length;j++){
////                System.out.print(row[j]+" ");
////            }
////            System.out.println();
////        }
//
//        //for each loop
////        for(int[] row:arr){
////            for(int num: row){
////                System.out.print(num+" ");
////            }
////            System.out.println();
////        }
//
//        //sum of all elements in each row
////        for(int i =0;i<arr.length;i++){
////            int sum = 0;
////            for(int j = 0;j<arr.length;j++){
////                sum+= arr[i][j];
////            }
////            System.out.println("Sum: " +sum);
////        }
//
//        //column sum of elements
//        for(int j = 0;j<arr[0].length;j++){
//            int col_sum = 0;
//            for(int i = 0;i<arr.length;i++){
//                col_sum+=arr[i][j];
//            }
//            System.out.println("Col Sum: "+ col_sum);
//        }

//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for(int i = 0;i<matrix.length;i++){
//            for(int j = 0;j<matrix[i].length;j++){
//                if(i ==0 || i==matrix.length-1){
//                    System.out.print(matrix[i][j]+ " ");
//                }
//            }
//            System.out.println();
//        }

        //sum of cols in 4x4 matrix
//        int[][] matrix = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//        for(int j = 0; j< matrix[0].length; j++){
//            int col_sum = 0;
//            for(int i = 0;i<matrix.length;i++){
//                col_sum+=matrix[i][j];
//            }
//            System.out.println("Col Sum: "+ col_sum);
//        }

        //sum of each element in a row
//        int[][] matrix ={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//       for(int i = 0;i<matrix.length;i++){
//       int row_sum = 0;
//       for(int j =0;j<matrix[0].length;j++){
//           row_sum+=matrix[i][j];
//       }
//       System.out.println("Sum: " +row_sum);
//       }

//        //column sum
//        int[][] matrix ={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//for(int j=0;j<matrix[0].length;j++){
//    int col_sum = 0;
//    for(int i = 0;i<matrix.length;i++){
//        col_sum+=matrix[i][j];
//    }
//    System.out.println("Sum: "+col_sum );
//}



        //traversal through 2d array
        int[][] matrix = {
                {1,2,3,13},
                {4,5,6,14},
                {7,8,9,15},
                {10,11,12,16}
        };
//        for(int i = 0;i<matrix.length;i++){
//            int[] row = matrix[i];
//            for(int j = 0;j<row.length;j++){
//                System.out.print(row[j]+" ");
//            }
//            System.out.println();
//        }
//        for(int[] row : matrix){
//            for(int num: row){
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }

        //row sum
//        for(int i = 0;i<matrix.length;i++){
//            int sum = 0;
//            for(int j = 0;j<matrix[i].length;j++){
//                sum+=matrix[i][j];
//            }
//            System.out.println("Sum of row "+ (i+1) +": "+sum);
//        }

        //col_sum
//        for(int j = 0;j<matrix[0].length;j++){
//            int col_sum = 0;
//            for(int i =0;i<matrix.length;i++){
//                col_sum+=matrix[i][j];
//            }
//            System.out.println("Sum of Column "+ (j+1)+": "+ col_sum);
//        }

        //first and last row print
//        for(int i = 0;i<matrix.length;i++){
//            int[] row = matrix[i];
//            for(int j = 0;j<row.length;j++){
//                if(i==0||i==matrix.length-1){
//                    System.out.print(matrix[i][j]+" ");
//                }
//            }
//            System.out.println();
//        }

        //sum of each column on a separate line
//        for(int j = 0;j<matrix[0].length;j++){
//            int col_sum = 0;
//            for(int i = 0;i<matrix.length;i++){
//                col_sum+=matrix[i][j];
//            }
//            System.out.println("Sum of col "+(j+1) +": "+ col_sum);
//        }

        //largest element in each row
        for(int i = 0;i<matrix.length;i++){
            int max = matrix[0][0];
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
            System.out.println("Largest element in row"+(i+1)+": "+ max);
        }
    }
}
