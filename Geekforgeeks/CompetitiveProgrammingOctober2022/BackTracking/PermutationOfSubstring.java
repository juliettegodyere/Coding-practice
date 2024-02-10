/**
 * We are going to learn backtracting by using an example.
 * Generate all permutations which do not contain "AB"  as a substring.
 * In backtracking, you do not need to move further if your current solution
 * does not lead a possible solution.
 * I/P - "ABC"
 * All permutations: ABC, ACB, BAC, BCA, CBA, CAB
 * O/P ACB, BAC, BCA, CBA
 * The naive approach, generates all the permutation but checks
 * in "AB" is present.
 * We can use backtracking technique to optimize this problem.
 * By backtracking any we notice that "AB" is present in the string.
 */
package BackTracking;

public class PermutationOfSubstring {
    /**
     * The naive approach
     * @param str
     * @param l
     * @param r
     */
    public static void permute(String str, int l, int r){
    
        if(l==r){
            if(str.contains("AB")==false){
                System.out.print(str+" ");
            }
            return;
        }else{
            for(int i=l;i<=r;i++){
                str=new String(swap(str, i, l));
                
                permute(str,l+1,r);
                
                str=new String(swap(str, i, l));
            }   
        }
    }
    /**
     * The isSafe function is to ensure that "AB" does not appear in the substring.
     * Check the diagram in the note;
     * @param str
     * @param l
     * @param r
     */
    public static void permute2(String str, int l, int r){
    
        if(l==r){
            System.out.print(str+" ");
            return;
        }else{
            for(int i=l;i<=r;i++){
                if(isSafe(str,l,i,r)){
                    str=new String(swap(str, i, l));
                
                    permute(str,l+1,r);
                
                    str=new String(swap(str, i, l));
                }
            }   
        }
    }
    
    public static boolean isSafe(String str,int l, int i, int r){
        if(l!=0 && str.charAt(l-1)=='A' && str.charAt(i)=='B')
            return false;
        //This condition handles when you have "BA" and when "BA" is swapped
        //You get "AB"
        if(r==(l+1) && str.charAt(i)=='A' && str.charAt(l)=='B')
            return false;
        return true;
    }
    
    public static char[] swap(String str, int i, int j) 
    { 
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return ch; 
    }
    
    public static void main(String args[])
    {
        String str="ABC";
	
        permute(str,0,str.length()-1); 
    }
}
