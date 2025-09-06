import java.util.*;
public class arrays2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        // for(int i =0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //         System.out.print(numbers[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter the element: ");
        // int x = sc.nextInt();
        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //         if(numbers[i][j]==x){
        //             System.out.print("The elements is found at location ("+ i + ","+ j +")");
        //         }
        //     }
        // }


        //transpose of a matrix
        // System.out.println("Transpose of Matrix:");
        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //         System.out.print(numbers[j][i] +" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();


        //spiral order matrix
        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = cols-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int col = colstart;col<=colend;col++){
                System.out.print(numbers[rowstart][col] + " ");
            }
            rowstart++;
            for(int row = rowstart;row<=rowend;row++){
                System.out.print(numbers[row][colend]+" ");
            }
            colend--;
            for(int col = colend;col>=colstart;col--){
                System.out.print(numbers[rowend][col]+" ");
            }
            rowend--;
            for(int row = rowend;row>=rowstart;row--){
                System.out.print(numbers[row][colstart]+" ");
            }
            colstart++;
            System.out.println();
        }
        sc.close();
    }

    
}
