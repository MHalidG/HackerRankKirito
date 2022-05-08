package Rank1;

import java.util.Scanner;

public class JavaDatatypes {

    //JavaDatatypes


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            long x = 0;
            try {
                x = sc.nextLong();
                sc.nextLine();
                if (x >= -128 && x <= 127) {
                    System.out.println(x + " can be fitted in:" + "\n* byte" + "\n* short" + "\n* int" + "\n* long");
                } else if (x <= Short.MAX_VALUE && x >= Short.MIN_VALUE) {
                    System.out.println(x + " can be fitted in:" + "\n* short" + "\n* int" + "\n* long");
                } else if (x <= Integer.MAX_VALUE && x >= Integer.MIN_VALUE) {
                    System.out.println(x + " can be fitted in:" + "\n* int" + "\n* long");
                } else if (x <= Long.MAX_VALUE && x >= Long.MIN_VALUE) {
                    System.out.println(x + " can be fitted in:" + "\n* long");}
                                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.nextLine() + " can't be fitted anywhere.");
                //Try Catch ile istemedigimiz bir giris oldugu zaman yakaliyoruz
                //Trick** Burada dikkat etmemiz gereken sey girilen girdiyi geri yansitabilmek
                //Long istedigimiz icin longtan baska bir girdi olunca onu catche atiyoruz
                //Catch onu oldugu gibi yakalayabilmesi icin scn.nextLine olmasi() lazim.
            }
        }
    }
}

