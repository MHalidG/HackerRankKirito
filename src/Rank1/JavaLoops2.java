package Rank1;

import java.io.IOException;
import java.util.Scanner;

public class JavaLoops2 {public class Solution {
//JavaLoops2
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();


        if (x>=2&&x<=20){
            for (int i = 1; i <11 ; i++) {
                System.out.println(x + " x " + i + " = " + (x * i));

            }
        }
        else{
            System.out.println("nayn da goood");
        }
    }
}
}
