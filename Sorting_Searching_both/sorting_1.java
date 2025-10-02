package Sorting_Searching_both;

import java.util.Scanner;

public class sorting_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }

        //selection sort
//        for(int i = 0;i<n;i++){
//            int min = i;
//            for(int j = i;j<n;j++){
//                if(num[min]>num[j]){
//                    min =j;
//                }
//                int temp = num[min];
//                num[min] = num[i];
//                num[i] = temp;
//            }
//        }

        //bubble sort
//        for(int i = n-1;i>=1;i--){
//            for(int j = 0;j<=i-1;j++){
//                if(num[j]>num[j+1]){
//                    int temp = num[j+1];
//                    num[j+1]= num[j];
//                    num[j]= temp;
//                }
//            }
//        }

        //insertion sort
        for(int i = 0;i<



                n;i++){
            int j = i;
            while(j>0 && num[j-1]>num[j]){
                int temp = num[j-1];
                num[j-1]= num[j];
                num[j]= temp;
                j--;
            }
        }
        for(int i =0;i<n;i++){
            System.out.print(num[i]+ " ");
        }
    }
}
