/*
public static String getSmallestAndLargest(String s, int k) {
        String smallest ="";
        String largest="";
        List<String> list = new ArrayList<>();

        for (int i = 1; i-1+k <s.length() ; i++) {
        list.add(s.substring(i-1, i-1+k));
        }
        for (int i = s.length()-1; i >=0 ; i--) {
        list.add(s.substring(s.length()-1-k+1));
        }
        for (int i = 0; i < ; i++) {

        }
        System.out.println(list);


        for (int i = 0; i <1; i++) {
        largest=list.get(i);
        for (int j = 0; j < list.size() ; j++) {
        if (largest.charAt(0)<list.get(j).charAt(0)) {
        largest=list.get(j);
        }else if (largest.charAt(0)==list.get(j).charAt(0)){
        if(largest.charAt(1)<list.get(j).charAt(1)){
        largest=list.get(j);
        }
        }
        }
        }
        for (int i = 0; i < 1; i++) {
        smallest=list.get(i);
        for (int j = 0; j < list.size() ; j++) {
        if (smallest.charAt(0) > list.get(j).charAt(0)) {
        smallest = list.get(j);
        } else if (smallest.charAt(0) == list.get(j).charAt(0)) {
        if (smallest.charAt(1) > list.get(j).charAt(1)) {
        smallest = list.get(j);
        }
        }
        }
        }
        return smallest + "\n" + largest;
        }*/
