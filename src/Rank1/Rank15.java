package Rank1;

import java.util.Scanner;

public class Rank15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = "java";
        String B = "hello";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.charAt(0));
        System.out.println(B.charAt(0));
        System.out.println(A.length() + B.length());
        String myString= A.charAt(0) > B.charAt(0) ?
                "Yes" : "No";
        System.out.println(myString);
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
    }
