import java.util.*;
public class ST2_Practice {
    //binary to decimal conversion
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int decimal =0;
//        int power = 0;
//        for(int i = str.length()-1;i>=0;i--){
//            char ch = str.charAt(i);
//            if(ch == '1'){
//                decimal+= (int) Math.pow(2,power);
//            }
//            power++;
//        }
//        System.out.println(decimal);
//    }

    //1. validate in public class(str equal hai ki nhi)
//    public static void main(String[] main){
//        String str1= "Hello";
//        String str2 = "hello";
//        if(str1.equals(str2)){
//            System.out.println("Same strings");
//        }
//        else{
//            System.out.println("Different strings");
//
//        }
//    }

    //3. equilateral triangle
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j = i;j<=n;j++){
//                System.out.print(" ");
//            }
//            for(int k =1;k<=i;k++){
//                System.out.print(k);
//            }
//            for(int k = i-1;k>=1;k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//    }


    //4. reverse a number
//    public static void reverse(int n){
//        int rev = 0, rem = 0, temp = n;
//        while(temp>0){
//            rem = temp%10;
//            rev = rev*10 + rem;
//            temp/=10;
//        }
//        System.out.println(rev);
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        reverse(n);
//
//    }

//6a. diamond pattern
//    public static void main(String[] args){
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n;i>=1;i--){
//            for(int j = n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int k = 2*i-1;k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //6b. pyramid pattern
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=2*i-1;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //7. insert an element in an array
//    public static void main(String[] args){
//        int[] arr ={1,2,3,4,5};
//        int element = 6;
//        int pos = 2;
//        int[] new_arr = new int[arr.length+1];
//        for(int i = 0;i<pos;i++){
//            new_arr[i]= arr[i];
//        }
//        new_arr[pos]= element;
//        for(int i = pos+1;i<new_arr.length;i++){
//            new_arr[i]= arr[i-1];
//        }
//        System.out.print(Arrays.toString(new_arr));
//    }

    //8. row_sum in matrix
//    public static void main(String[] args){
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int[] new_arr= new int[3];
//        for(int i =0;i<matrix.length;i++){
//            int row_sum = 0;
//            for(int j = 0;j<matrix[0].length;j++){
//                row_sum+=matrix[i][j];
//            }
//            new_arr[i] = row_sum;
//        }
//        System.out.println(Arrays.toString(new_arr));
//        int sum = 0;
//        for(int i = 0;i<new_arr.length;i++){
//            sum+=new_arr[i];
//        }
//        System.out.println(sum);
//    }

    //9. fibonacci using recursion
//    static int fibonacci(int n){
//        if(n==0||n==1){
//            return n;
//        }
//        else{
//            return fibonacci(n-1)+fibonacci(n-2);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int result = fibonacci(n-1);
//        System.out.println(result);
//    }


    //10. linear search
//    static int linear(int[] arr, int element){
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]==element){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int[] arr= {1,2,3,4,5};
//        int element = sc.nextInt();
//        int result = linear(arr, element);
//        System.out.println("Element found at index: "+ result);
//    }


//    //quicksort
//    public static void quick_sort(int[] arr, int low, int high){
//        if(low<high){
//            int pi = partition(arr,low,high);
//            quick_sort(arr,low,pi-1);
//            quick_sort(arr,pi+1,high);
//        }
//    }
//    static int partition(int[] arr, int low, int high){
//        int pivot = arr[high];
//        int i = low-1;
//        for(int j = low;j<high;j++){
//            if(arr[j]<pivot){
//                i++;
//                int temp=arr[i];
//                arr[i]= arr[j];
//                arr[j]= temp;
//            }
//        }
//       i++;
//        int temp = arr[i];
//        arr[i]= arr[high];
//        arr[high]= temp;
//        return i;
//    }
//    public static void main(String[] args){
//        int[] arr ={10,7,9,1,8,5};
//        quick_sort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }

    //power(base,exp)
//    public static int power_func(int base, int exp){
//        return (int) Math.pow(base,exp);
//    }
//    public static void main(String[] args){
//        int base = 3;
//        int exp = 4;
//        int result =power_func(base,exp);
//        System.out.println(result);
//    }

    public static int sum_of_digits(int n){
        if(n<10 && n>0){
            return n;
        }
        else if(n<0){
            return -sum_of_digits(-n);
        }
        else{
            return n%10+sum_of_digits(n/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum_of_digits(n);
        System.out.println(result);
    }
}

