package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    static ArrayList<String> generate(int N) {
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String v = q.poll();
            list.add(v);

            q.add(v + "0");
            q.add(v + "1");
        }
        return list;
    }
    
    public static void main(String args[]) 
	{ 
		int n = 10;
		
		System.out.println(generate(n));
	} 
}
