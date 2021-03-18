package com.Kashika;
import java.util.Scanner;
import java.lang.String;



public class Main {
    public static void main(String[] args) {
    int i,j, h=0;
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
    String arr = scan.nextLine();
    arr.toLowerCase();
    String ar=arr.trim();
    int a = ar.length()-1; j = a ;

            for( i=0;i<= a; i++) {


                char c = arr.charAt(i);
                char d = arr.charAt(j);

                if (c == d)
                    h = 1;

                else
                 h = 0;

                j--;
            }

        if(h==1)
            System.out.println("The word is a Palindrome.");
        else
        System.out.println("The word is not a Palindrome.");
    }
}
