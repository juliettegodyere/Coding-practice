package FuzzyMatching;

public class SubsequnceApproach {
    static String findBestMatch(String str, String[] strArray){
        int n = strArray.length;
        int m = str.length();
        int j = 0;
        int count;
        int maxCount = 0;
        String selected = "No match found";

        for(int k = 0; k < n; k++){
            count = 0;
            int subLen = strArray[k].length();
            for(int i = 0; i < subLen && j < m; i++){
                if(strArray[k].charAt(i) == str.charAt(j)){
                    j++;
                    count++;
                }
                // if(j == m){
                    
                // }
            }
            if(maxCount < count){
                        maxCount = count;
                        selected = strArray[k];
                    }
                  System.out.println("Max Count is" + maxCount);
                  System.out.println("Count is" + count);
        }
        return selected;
    }
    public static void main(String[] args)
    {
        String str1 = "METRONIDAZOLE TAB 200MG";
        String strArray[] = {
            // "METRONIDAZOLE TAB 200MG",
            "PETHIDINE 50MG TABLET",
            "PENTAZOCINE INJ B.P 30mg / ml",
            // "METRONIDAZOLE 200MG PER 5ML SUSP",
            "METRONIDAZOLE 400MG TAB",
        };
        System.out.println(findBestMatch(str1, strArray));
    }
}
