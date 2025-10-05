package Array_Practice;
import java.util.Arrays;

public class insertion {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int element = 6;
        int pos = 2;
        int[] new_arr = new int[n+1];
        for(int i = 0; i < pos; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[pos] = element;
        for(int i = pos; i < n; i++) {
            new_arr[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
