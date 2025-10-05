public class patterns2 {
    public static void main(String[] args){
//        for(int i =1;i<=4;i++){
//            for(int j = 1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //right angled triangle
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //inverted right triangle
//        for(int i = 5;i>=1;i--){
//            for(int j = i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //number triangle
//        int n = 1;
//        for(int i = 1;i<=4;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(j);
//
//            }
//            System.out.println();
//        }

        //inverted triangle 2
//        for(int i = 5;i>=1;i--){
//            for(int j =1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //staircase pyramid pattern
//        String str[] = {"I","N","T","E","L","L","I","J"};
//        int len = str.length;
//        for(int i = 0;i<len;i++){
//            for(int j = i;j<len;j++){
//                System.out.print(str[j]);
//            }
//            System.out.println();
//        }


        //square 3x3
//        for(int i = 1;i<=3;i++){
//            for(int j = 1;j<=3;j++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }

        
//        for(int i = 7;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i = 2;i<=7;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //pascal triangle
//        int rows = 5;
//        for(int i = 0;i<rows;i++){
//            int number =1;
//            for(int j = 0;j<rows-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 0;j<=i;j++){
//                System.out.print(number +" ");
//                number= number *(i-j)/(j+1);
//            }
//            System.out.println();
//        }

        //12345 pattern in 4 lines
        for(int i = 1;i<5;i++){
            for(int j = 1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


