package Rank1;

import java.util.Scanner;

public class Rank4 {

    //Java Stdin and Stdout II

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1=sc.next();
            int x= sc.nextInt();
            System.out.printf("%-30s%010d\n",s1,x);
                    }
        System.out.println("================================");

    }
}
