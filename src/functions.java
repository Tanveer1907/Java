import java.util.Scanner;
public class functions {
    // function for printing name
//    public static void print_name(String name){
//        System.out.print(name);
//        return;
//    }

    //function for sum of 2 numbers
//    public static void sum(int a, int b){
//        int sum = a+b;
//        System.out.print(sum);
//        return;
//    }

    //factorial of number
//    public static void factorial(int n){
//        int fact = 1;
//        for(int i = n;i>=1;i--){
//            fact= fact *i;
//        }
//        System.out.print(fact);
//        return;
//    }

    //prime
//    public static void prime(int n){
//        int flag = 1;//prime
//        if(n<2){
//            System.out.print("Not prime");
//            return;
//        }
//        else{
//            for(int i = 2;i<n/2;i++){
//                if(n%i==0){
//                    flag = 0;//not prime
//                    break;
//                }
//            }
//        }
//        if(flag==0){
//            System.out.print("Not Prime");
//        }
//        else{
//            System.out.print("Prime");
//        }
//        return;
//    }

    //fibonacci series
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        for(int i = 0;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        print_name(name);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        sum(a,b);
          int n= sc.nextInt();
//          factorial(n);
//          prime(n);
          fibonacci(n);

    }
}
