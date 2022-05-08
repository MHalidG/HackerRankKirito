package Rank1;
import java.util.*;
public class JavaStdinandStdout_I {
    public static void main(String[] args) {
//Java_Stdin_and_Stdout_I
              Scanner scan=new Scanner(System.in);

              int n= scan.nextInt();

              /*
              n tek sayi ise    weird]
              n cift sayi ise ve 2-5 icindeyse not weird
              n cift sayi ise ve 6-20 icindeyse weird
              n ciftse ve yirmiden buyukse      not weird

              1<=n<=100
               */
if (n<=0&&n>=100) {
    System.out.println("Lutfen istenilen sayiyi giriniz");
}

  else if (n%2==0){
      if (n>20){
            System.out.println("Not Weird");
    }
        else if(1<n&&n<6){
            System.out.println("Not Weird");
        }
        else if (6<=n&&n<=20) {
          System.out.println("Weird");

      }


        } else if (n%2!=0){
            System.out.println("Weird");}
    }
}

