package Sorting_Searching_both;
import java.util.*;
public class St2_practice {

    //linear search
//    static int linear(int[] arr, int element){
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]== element){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4};
//        System.out.println(linear(arr,2));
//    }

//    binary search
//    static int binary(int[] arr,int element){
//        int left = 0;
//        int right = arr.length - 1;
//        while(left<=right){
//            int mid = left+(right-left)/2;
//            if(arr[mid]==element){
//                return mid;
//            }
//            else if(arr[mid]<element){
//                left = mid+1;
//            }
//            else{
//                right = mid -1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5};
//        System.out.println(binary(arr,4));
//    }

    //first occurrence of an element
//    static int first(int[] arr, int element){
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]==element){
//                return i;
//            }
//        }
//        return -1;
//
//    }

    //last occurrence of an element
//    static int last(int[] arr, int element){
//        for(int i = arr.length-1;i>=0;i--){
//            if(arr[i]== element){
//                return i;
//            }
//        }
//        return -1;
//    }

    //count occurrences of an element
//    static int count_occurrences(int[] arr, int element){
//        int count = 0;
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]== element){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,4,4,5};
//        int element = 4;
//        System.out.println( count_occurrences(arr, element));
//    }

    //search in a string array
//    static int search(String[] arr, String element){
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i].equals(element)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        String[] arr ={"apple","banana"};
//        System.out.println(search(arr, "banana"));
//    }

    //minimum element in unsorted array
//    static int min_element(int[] arr){
//        int min = arr[0];
//        for(int i = 1;i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//    public static void main(String[] args){
//        int[] arr= {5,1,4,3,2};
//        System.out.println(min_element(arr));
//    }

    //first occurrence in sorted array with duplicates
//    static int first_occurrence_sorted(int[] arr, int element){
//        int low = 0;
//        int high = arr.length-1;
//        int result = -1;
//        while(low<=high){
//            int mid = low+(high-low)/2;
//            if(arr[mid]==element){
//                result = mid;
//                high = mid-1;
//            }
//            else if(arr[mid]<element){
//                low = mid+1;
//            }
//            else{
//                high = mid-1;
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args){
//        int[] arr = {2, 4, 4, 5};
//        System.out.println(first_occurrence_sorted(arr, 4));
//    }

//    binary search in rotated sorted array
    static int search(int[] arr, int element){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=element && element< arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid]<element && element<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
}
