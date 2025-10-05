package Sorting_Searching_both;
import java.util.*;
public class binary_search {
    static int binary(int[] arr, int element){
        int left = 0;
        int right = arr.length -1;
        int mid = left+(right-left)/2;
        while(left<=right){
            if(arr[mid]== element){
                return mid;
            }
            else if(arr[mid]<element){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int search = binary(arr, element);
        if (search != -1) {
            System.out.println("Element found at index: " + search);
        } else {
            System.out.println("Element not found.");
        }
    }
}
