import java.util.Scanner;

public class loops {
//        public static void main(String args[]){
//            int n = 4;
//            for (int i =1;i<=4;i++){
//                for (int j = 1;j<=i;j++){
//                    System.out.print("*"); // star before space
//                }
//                for (int j =1;j<=2*(n-i);j++){
//                    System.out.print(" "); // for space between stars
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*"); // star after space
//                }
//                System.out.println();
//            }
//            for (int i = n; i>=1;i--){ // mirror pattern for upper code
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                for (int j = 1; j <= 2 * (n - i); j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }


    public static void main(String[] args){
//        for (int i = 0;i<5;i++){
//            System.out.println("Hello");
//        }
//        for (int i = 0;i<=10;i++){
//            System.out.println(i);
//        }
//        int i = 10;
//        while(i>0){
//            System.out.println(i);
//            i--;
//
//        }
//        int i = 10;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while(i<15);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int sum = 0;
//        for(int i = 0;i<=num;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//        for(int i = 0;i<=10;i++){
//            System.out.println(i*num);
//        }

//        for(int i= 0;i<=num ;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Enter student's marks (out of 100)");
            System.out.println("0. Exit");
            System.out.print("Enter choice (1 or 0): ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter marks (0–100): ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                } else {
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) { // 60–89
                        System.out.println("This is also Good");
                    } else { // 0–59
                        System.out.println("This is Good as well");
                    }
                    System.out.println("Because marks don’t matter but our effort does.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (choice != 0);

        System.out.println("Program ended.");
        sc.close();
    }
   }

