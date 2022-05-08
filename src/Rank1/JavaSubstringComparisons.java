package Rank1;
import java.util.*;

public class JavaSubstringComparisons {
 public static void main(String[] args) {
    String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
     System.out.println(getSmallestAndLargest(s, 30));
     System.out.println(s.length());
 }

    public static String getSmallestAndLargest(String s, int k) {
      String currently=s.substring(0,k);
        String smallest =currently;
        String largest=currently;

        for (int i = 1; i <=s.length()-k ; i++) {
            currently=s.substring(i,i+k);
            if(currently.compareTo(largest)>0){
                largest=currently;
            }
            if(currently.compareTo(smallest)<0){
                smallest=currently;
            }
        }




        return smallest + "\n" + largest;
    }
}