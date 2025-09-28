import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size: ");
//        int size = sc.nextInt();
//        int marks[] = new int[size];
//        for(int i = 0;i<size;i++){
//            marks[i]= sc.nextInt();
//        }
//        System.out.print("Enter the element: ");
//        int element = sc.nextInt();
//        for(int i = 0;i<size;i++){
//            if(element == marks[i]){
//                System.out.print(i);
//            }
//        }

        //max min in array
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size: ");
//        int size = sc.nextInt();
//        int num[] = new int[size];
//        for(int i = 0;i<size;i++){
//            num[i]= sc.nextInt();
//        }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<size;i++){
//            if(max<num[i]){
//                max = num[i];
//            }
//            if(num[i]<min){
//                min = num[i];
//            }
//        }
//        System.out.println("Max: "+ max);
//        System.out.println("Min: "+min);

        //ascending order check

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i = 0;i<size;i++){
            num[i]= sc.nextInt();
        }
        int ascending = 1;//sorted
        for(int i =0 ;i<size-1;i++){
            if(num[i]>num[i+1]){
                ascending = 0;//not sorted
                break;
            }
        }
        if(ascending==1){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
