package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Name: "+ name);

        //concatenation  
        // String first = "Hello";
        // String second = "World!";
        // String full = first+" "+ second;
        // System.out.println(full.length());

        // //charAt
        // for(int i = 0;i<full.length();i++){
        //     System.out.println(full.charAt(i));
        // }

        //compare 
        //1 s1>s2 : +ve value
        //2 s1== s2: 0
        //3 s1<s2: -ve value
        //comparison of ascii values of characters
        // if(first.compareTo(second)==0){
        //     System.out.println("Strings are equal.");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        //substring 
        // String sentence = "My name is Tanveer";
        // // substring(beg index, end index);
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);
        // sc.close();4

        //q1
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String array[] = new String[size];
        int length = 0;
        for(int i = 0;i<size;i++){
            array[i] = sc.nextLine();
            length+=array[i].length();
        }
        System.out.println((length));
        sc.close();
    }

}
