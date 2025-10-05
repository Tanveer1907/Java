import java.util.Scanner;
public class practice_FA3 {

    public class isPalindrome{
        static int reverse(int num, int rev){
            if(num == 0){
                return rev;
            }
            return reverse(num/10, rev*10+ num%10);
        }
    }
    public static void main(String[] args){

        //arithmetic operators
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        int a = 20, b =10;
//        System.out.println("Choose Operation: ");
//        System.out.println("1. Addition");
//        System.out.println("2. Subtraction");
//        System.out.println("3. Multiplication");
//        System.out.println("4. Division");
//        System.out.println("5. Modulus");
//
//        switch(choice){
//            case 1:
//                System.out.println("Result = " +(a+b));
//                break;
//            case 2:
//                System.out.println("Result = " + (a - b));
//                break;
//            case 3:
//                System.out.println("Result = " + (a * b));
//                break;
//            case 4:
//                if (b != 0)
//                    System.out.println("Result = " + (a / b));
//                else
//                    System.out.println("Division by zero not allowed!");
//                break;
//            case 5:
//                if(b!=0){System.out.println("Result = " + (a % b));}
//                else {
//                    System.out.println("Modulus by zero not allowed!");
//                    break;
//                }
//            default:
//                System.out.println("Invalid Choice");
//        }
//sc.close();

        //prime
//        int num = 29;
//        boolean isPrime = true;
//        if(num<=1){
//            isPrime = false;
//        }
//        else{
//            for(int i = 2;i<num/2;i++){
//                if(num%i==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if(isPrime==true){
//            System.out.println("Prime");
//        }
//        else{
//            System.out.println("Not prime");
//        }

        //deletion of element using left shift
//        int[] arr = {1,2,3,4,5};
//        int pos = 2;
//        for(int i = pos; i<arr.length-1; i++){
//            arr[i]= arr[i+1];
//        }
//        arr[arr.length - 1] = 0;
//        for (int val : arr) System.out.print(val + " ");


        //deletion using right shift
//        int[] arr = {1,2,3,4,5};
//        int pos = 2;
//        for(int i= pos;i>0;i--){
//            arr[i]= arr[i-1];
//        }
//        arr[0]= 0;
//        for(int i = 0;i<arr.length;i++){System.out.print(arr[i]+ " ");}


        //right angled triangle
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //square pattern
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //hollow square
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5;j++){
//                if(i == 1|| i==5|| j ==1|| j==5 ){
//                System.out.print("*");}
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        //addition of 2d matrices
//        int[][] a = {{1, 2, 3}, {4, 5, 6}};
//        int[][] b = {{7, 8, 9}, {1, 2, 3}};
//        int[][] sum = new int[2][3];
//
//        for(int i = 0;i<2;i++){
//            for(int j = 0;j<3;j++){
//                sum[i][j]+=a[i][j]+b[i][j];
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }

        //palindrome number
//        int num = 112, rev = 0, temp = num, rem;
//        while(temp>0){
//            rem = temp%10;
//            rev = rev*10 +rem;
//            temp/=10;
//        }
//        if(rev == num){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }

        //palindrome string
//        String str = "mom";
//        String rev = "";
//        for(int i = str.length()-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//        if(str.equals(rev)){
//            System.out.print("Palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }

        //largest element in array
//        int[] arr = {1,2,3,4,5};
//        int max = arr[0];
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.print(max);


//        //smallest element in the array
//        int[] arr = {5,2,3,4,1};
//        int min = arr[0];
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.print(min);

        //palindrome of integer using recursion
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rev = reverse(num,0);
//        if(num == rev){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }

    }

}
