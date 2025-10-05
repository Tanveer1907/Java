import java.util.*;
public class St2 {
    //prime
//    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       boolean prime = true;
//       if(n<2){
//           System.out.println("Not prime");;
//       }
//       else{
//           for(int i = 2;i<n/2;i++){
//               if(n%i==0){
//                   prime = false;
//               }
//           }
//       }
//       if(prime){
//           System.out.println("Prime");
//       }
//       else{
//           System.out.println("Not prime");
//       }
//    }

    //fibonacci
    static void fibonacci(int n){
        int a =0;
        int b = 1;
        for(int i = 0;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

    //reverse a number
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

    //count vowel, consonant, digits, special symbol in string
//    public static void counting(String str){
//        int vowel = 0, consonant = 0, digits = 0, special = 0;
//        str = str.toLowerCase();
//        for(int i = 0;i<str.length();i++){
//            char c = str.charAt(i);
//            if(c>='a' && c<='z'){
//                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
//                    vowel++;
//                }
//                else{
//                    consonant++;
//                }
//            }
//            else if(c>='0' && c<='9'){
//                digits++;
//            }
//            else{
//                special++;
//            }
//        }
//        System.out.println("Vowels:"+vowel);
//        System.out.println("Consonant:"+ consonant);
//        System.out.println("Numbers: "+ digits);
//        System.out.println("Special Character: "+ special);
//    }
//    public static void main(String[] args){
//        String str = "Hello@123";
//        counting(str);
//    }

    //hollow square
//    public static void main(String[] args){
//        int n = 5;
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5;j++){
//                if(i==1||i==5||j==1||j==5){
//                    System.out.print("#");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    //pyramid of numbers
//    public static void main(String[] main) {
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(k);
//            }
//            for (int k = i - 1; k > 0; k--) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//    }

//prime numbers between 2 numbers
//    static boolean prime(int n){
//        if(n<2){
//            return false;
//        }
//        else{
//            for(int i = 2;i<n/2;i++){
//                if(n%i==0){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the start: ");
//        int start = sc.nextInt();
//        System.out.print("Enter the end: ");
//        int end = sc.nextInt();
//        for(int i = start;i<=end;i++){
//            if(prime(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }

    // row sum of 2d matrix
//    public static void main(String[] args){
//      int[][] matrix = {
//              {1,2,3},
//              {4,5,6},
//              {7,8,9}
//      };
//      for(int i = 0;i<matrix.length;i++){
//          int row_sum = 0;
//          for(int j = 0;j<matrix[0].length;j++){
//              row_sum+=matrix[i][j];
//          }
//          System.out.println("Sum of row "+(i+1)+": "+row_sum);
//      }
//
//    }

    //sum of diagonal elements of 2d array
//    public static void main(String[] args){
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int diagonal_sum = 0;
//        for(int i =0;i<matrix.length;i++){
//
//            for(int j= 0;j<matrix.length;j++){
//                if(i==j){
//                diagonal_sum+=matrix[j][j];}
//            }
//        }
//        System.out.println("Sum of diagonals is: "+ diagonal_sum);
//    }

    //product of 2 matrices
//    public static void main(String[] args){
//        int[][] matrix1= {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//        };
//        int[][] matrix2 ={
//                {10,11,12},
//                {13,14,15},
//                {16,17,18}
//        };
//        int[][] product = new int[3][3];
//        for(int i = 0;i<matrix1.length;i++){
//            for(int j =0;j<matrix2[0].length;j++){
//                product[i][j]= 0;
//                for(int k = 0;k<3;k++){
//                    product[i][j] = matrix1[i][k]*matrix2[k][j];
//                }
//            }
//        }
//        System.out.println("Product of matrices: ");
//        for(int i = 0;i<3;i++){
//            for(int j = 0;j<3;j++){
//                System.out.print(product[i][j] +" ");
//            }
//            System.out.println();
//        }
//    }


    //palindrome plus armstrong
//    static void palindrome(int n){
//        int temp = n, rem = 0, rev = 0;
//        while(temp>0){
//            rem = temp%10;
//            rev = rev*10+rem;
//            temp/=10;
//        }
//        if(rev == n){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//    }
//
//    static void armstrong(int n){
//        int temp = n, digits = 0, sum = 0;
//        while(temp>0){
//            temp/=10;
//            digits++;
//        }
//        temp = n;
//        while(temp>0){
//            int d = temp%10;
//            sum+= (int)Math.pow(d,digits);
//            temp/=10;
//        }
//        if(n == sum){
//            System.out.println("Armstrong");
//        }
//        else{
//            System.out.println("Not armstrong");
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        palindrome(n);
//        armstrong(n);
//    }

    //diamond pattern
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


    //pascals triangle
//    public static void main(String[] args){
//        int n = 5;
//        for(int i = 0;i<n;i++){
//            int number = 1;//first digit is always 1
//            for(int j = 0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<=i;j++){
//                System.out.print(number+" ");
//                number = number*(i-j)/(j+1);
//            }
//            System.out.println();
//        }
//    }

    //smallest and largest element in an array
//    public static void main(String[] args){
//       int[] arr = {1,2,3,4,5};
//       int max = arr[0];
//       int min = arr[1];
//       for(int i = 0;i<arr.length;i++){
//           if(arr[i]>max){
//               max = arr[i];
//           }
//           if(arr[i]< min){
//               min = arr[i];
//           }
//       }
//        System.out.println(max);
//        System.out.println(min);
//    }

//    //insert an element in an array
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

    //frequency of each element in array
//    public static void main(String[] args){
//        int[] arr = {1,2,3,4,4,5,2};
//        Arrays.sort(arr);
//        int count = 1;
//        for(int i =1;i<=arr.length-1;i++){
//            if(arr[i]==arr[i-1]){
//                count++;
//            }
//            else{
//                System.out.println(arr[i - 1] + " occurs " + count + " times");
//                count = 1;
//            }
//        }
//        System.out.println(arr[arr.length-1]+" occurs "+ count+" times");
//    }


}
