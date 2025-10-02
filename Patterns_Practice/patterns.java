package Patterns_Practice;

public class patterns {
    public static void main(String[] args){
        //square pattern
//        for(int i = 1;i<5;i++){
//            for(int j=1;j<5;j++){
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }

        //hollow rectangle
//        int a = 5;
//        int b = 6;
//        for(int i = 1;i<=a;i++){
//            for(int j = 1;j<=b;j++){
//                if(i == 1 || j == 1 || i == a|| j==b ){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //right-angled triangle
//        int n = 4;
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(" * ");
//            }
//            System.out.print("\n");
//        }

        //inverted right-angled triangle
//        int n= 4;
//        for(int i = n;i>0;i--){
//            for(int j = i;j>0;j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //mirrored right-angled triangle
//        int n = 4;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //numbered right-angled triangle
//        System.out.print("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //inverted numbered right-angled triangle
//        System.out.print("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = n;i>0;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //floyd's triangle
//        int n = 5;
//        int count = 1;
//        for(int i = 1;i<=5;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }

        //0-1 triangle
//        System.out.print("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for( int i = 1;i<=n;i++){
//            for( int j = 1;j<=i;j++){
//                int sum = i+j;
//                if(sum%2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

        //butterfly pattern
//        int n = 4;
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n;i>=1;i--){
//            for(int j = i;j>=1;j--){
//                System.out.print("*");
//            }
//            for(int j = 2*(n-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j = i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //solid rhombus
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //number pyramid
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print(" " + i);
//            }
//            System.out.println();
//        }

        //palindrome pattern
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = i;j>=1;j--){
//                System.out.print(""+ j);
//            }
//            for(int j= 2;j<=i;j++){
//                System.out.print("" +j);
//            }
//            System.out.println();
//        }

        //diamond pattern
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
//            for(int k =2*i-1;k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //hollow butterfly
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                if(j==1 || j ==i){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                if(j ==1 || j==i){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i = n;i>=1;i--){
//            for(int j = i;j>=1;j--){
//                if(j==1 || j ==i){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            for(int j = 2*(n-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j = i;j>=1;j--){
//                if(j ==1 || j==i){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//    }

        //hollow rhombus
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j= 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
}
}
