package Rank1;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.*;

public class Deneme_Class {
    public static void main(String[] args) {
       /* String str="123123123";
        System.out.println(Integer.valueOf(str));
        int a= Integer.valueOf(str);
        System.out.println(a);*/

    /*    double a=87789.1231;

        NumberFormat nmb=NumberFormat.getCurrencyInstance();*/
        String s="welcometojava";
        getSmallestAndLargest(s,3);
    }
        public static String getSmallestAndLargest(String s, int k) {
            String smallest ="";
            String largest = "";
            List<String> splitted=new ArrayList<>(Arrays.asList());

            for (int i = 1; i-1+k <s.length() ; i++) {
                splitted.add(s.substring(i-1, i-1+k));
                splitted.add(s.substring(s.length()-1-k+1));
                }

            System.out.println(splitted);
            smallest= String.valueOf(splitted.stream().
                    sorted().findFirst());
            largest= String.valueOf(splitted.stream().
                    sorted(Comparator.comparing(t -> t.toString().charAt(0)).
                            reversed()).findFirst());


            return smallest + "\n" + largest;
        }






    }

