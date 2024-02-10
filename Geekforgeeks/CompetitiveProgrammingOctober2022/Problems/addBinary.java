package Problems;

public class addBinary {
    public static String addBinary(String a, String b) {
        String str = "";
        int n = a.length();
        int m = b.length();

        int l = Math.min(n,m);
        System.out.println(l);
        for(int i = l-1; i >= 0; i--){
            int aa = Integer.parseInt(""+a.charAt(i));
            int bb = Integer.parseInt(""+b.charAt(i));
            int rem = aa+bb == 2 ? 1 : 0;

            if((aa+bb+rem) == 2){

            }
            System.out.println(rem);
        }
        return "";
    }
    public static void main (String[] args) {
		

		System.out.println(addBinary("1", "1"));

	}
}
