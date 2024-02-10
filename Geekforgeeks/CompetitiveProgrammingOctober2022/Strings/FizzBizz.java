package Strings;

public class FizzBizz {
    public static String printFizzBizz(int N, int M){
        String sequence = "";
		for(int i = N; i <= M; i++){
			if(i % 3 == 0 && i % 5 == 0){
				sequence+="FizzBuzz";
			}else if(i % 5 == 0){
				sequence+="Buzz";
			}else if(i % 3 == 0){
				sequence+="Fizz";
			}else{
				sequence+=i;
			}
			if(i < M){
                sequence+=",";
            }
		}
		    return sequence;
	    }
	
    public static void main (String[] args){
        int N = 1;
        int M = 100;
        System.out.println(printFizzBizz(N, M));
    }
}
