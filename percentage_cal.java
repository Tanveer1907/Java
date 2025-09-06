import java.util.Scanner;

public class percentage_cal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("DS:");
        float DS = sc.nextInt();
        System.out.println("OOSE:");
        float OOSE = sc.nextInt();
        System.out.println("DBMS:");
        float DBMS = sc.nextInt();
        System.out.println("FEE:");
        float FEE = sc.nextInt();
        System.out.println("IOT:");
        float IOT = sc.nextInt();

        double total = DS+ OOSE+DBMS+FEE+IOT;
        double average = total/5;

        System.out.println(average);
        sc.close();;
    }

}
