package Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfMetrix {

    public static int matMed(int mat[][], int r ,int c){

        ArrayList<Integer> list = new ArrayList<>(); 

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        int mid = list.size()/2;
        System.out.println(mid);
        if(list.size() % 2 != 0){
            return list.get(mid);
        }else{
            return (list.get(mid) + list.get(mid-1)) / 2;
        }

    }
    public static void main(String[] args)
    {
        int r = 3, c = 5;
        int m[][]= { {5,10,20,30,40}, {1,2,3,4,6}, {11,13,15,17,19} };
        //1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 15, 17, 19, 20, 30, 40
        System.out.println("Median is " + matMed(m, r, c)); 
        
    }

}
