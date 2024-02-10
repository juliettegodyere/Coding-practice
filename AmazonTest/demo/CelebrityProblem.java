package AmazonTest.demo;

import java.util.ArrayList;
import java.util.List;

public class CelebrityProblem {
    public static int findCelebrity(List<String> related){
        int n = related.size();
        char M[][] = new char[n][n];
       for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                char ch = related.get(i).charAt(j);
                M[i][j] =ch;
            }
       }
    //    for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //            System.out.print(M[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
       int a = 0, b = n-1;

       while(a < b){
            if(M[a][b] == '1'){
                a++;
            }else{
                b--;
            }
       }
       for(int i = 0; i < n; i++){
            if(i!=a && (M[a][i] == '1' || M[i][a] == '0')){
                return -1;
            }
       }
       return a;
    }
    public static void main(String[] args){
        List<String> str1 = new ArrayList<>();
        str1.add("010");
        str1.add("000");
        str1.add("010");

        System.out.println(findCelebrity(str1));
    }
}
