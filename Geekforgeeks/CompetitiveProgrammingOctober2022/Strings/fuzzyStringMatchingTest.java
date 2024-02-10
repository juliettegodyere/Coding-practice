package Strings;

import java.util.*;

public class fuzzyStringMatchingTest {

    static void findEncryptedArray(String arr[], String str)
    {   
        int n = arr.length;
        char char1[] = str.toCharArray();
        Arrays.sort(char1);
        for(int i = 0; i < n; i++){
            int count = 0, j =0;
            char char2[] = arr[i].toCharArray();
            Arrays.sort(char2);

            while(j < char1.length && j < char2.length){
                if(char2[j] == char1[j]){
                    count++;
                }
                j++;
                // System.out.print("Count "+ count + " ");
                // System.out.print("J "+ j + " ");
                // System.out.print("Char2  "+ char2.length + " ");
                // System.out.println("Char1  "+ char1.length);
            }
            System.out.print(new String(char1) + " ");
            System.out.print(new String(char2) + " ");
            System.out.println(count);

        }
    }
    static void findEncryptedArray2(String arr[], String str)
    {   
        List<String> list1 = new ArrayList<>(Arrays.asList(str.toLowerCase().split("[, . / ) ( ']+")));
       // Collections.sort(list1);

        int n = arr.length;
        for(int i = 0; i < n; i++){
            List<String> list2 = new ArrayList<>(Arrays.asList(arr[i].toLowerCase().split("[, . / ) ( ']+")));
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            Collections.sort(list2, new LexicographicComparator());
            for(int j = 0; j < list2.size() && j < list1.size(); j++){
                if(list2.contains(list1.get(j))){
                    //list3.add(list1.get(j));
                    list4.add(list1.get(j));
                }
            }
            System.out.println("list1" + list1);
            System.out.println("list2" + list2);
            if(list4.size() != 0){
                System.out.print(String.join(" ", list1) + " ");
                System.out.println(String.join(" ", list4));
            }
        }

        
    }

    public static int getLenPercentage(int n, int m){
        return Math.min(n, m);
    }

    public static void main(String[] args)
    {
        String str1 = "PARACETAMOL SUPPOSITORY 125MG";
        String strArray[] = {
            "METRONIDAZOLE TAB 200MG",
            "PETHIDINE 50MG TABLET",
            "PENTAZOCINE INJ B.P 30mg / ml",
            "METRONIDAZOLE 200MG PER 5ML SUSP",
            "METRONIDAZOLE 400MG TAB",
            "METRONIDAZOLE 500MG INFUSION",
            "PARACETAMOL USP 125mg/2 x 5 ( SUPPOSITORIE)"
        };
        findEncryptedArray2(strArray, str1);
    }
}
class LexicographicComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        return o1.compareToIgnoreCase(o2);
       // throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
}
