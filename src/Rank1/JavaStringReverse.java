package Rank1;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String rS="";

        for (int i = s.length()-1; i >=0 ; i--) {
            rS+=s.charAt(i);
        }

if (rS.equals(s)){
    System.out.println("Yes");
}else System.out.println("No");

    }
}
