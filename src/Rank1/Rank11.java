package Rank1;
import java.io.*;
import java.time.LocalDate;

public class Rank11 {

    //Java Date and Time

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        return;
    }

    public static String findDay(int month, int day, int year) {
        LocalDate Trh= LocalDate.of(year,month,day);
        String theDay= String.valueOf(Trh.getDayOfWeek());
//verilen tarihi saklayacak LocalDate class bir variable olusturuyoruz.
        //sonra time methodlarindan getDayOfWeek(); ile gununu alip String
        //Class bir variable'a atiyoruz ve onu return ediyoruz

    return theDay ;
    }
}


