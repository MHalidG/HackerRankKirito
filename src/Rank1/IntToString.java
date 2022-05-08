package Rank1;

import java.util.Scanner;

public class IntToString {

    //IntToString

    public static void main(String[] args) {
        //Alinan int degeri hiclikle birlestirerek stringlestiriyoruz.
        Scanner scan=new Scanner(System.in);
        int n=scan. nextInt();
        if (n>=-100&&n<=100){
            String str=n+"";
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer");
        }

    }
}

