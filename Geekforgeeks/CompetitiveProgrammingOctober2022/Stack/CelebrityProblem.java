package Stack;

/***
 * Certainly! Let's go through a dry run with a small matrix:

csharp
Copy code
M = [
    [0, 1, 0],
    [0, 0, 0],
    [0, 1, 0]
]
Here, n = 3 (number of people).

Iteration 1 (i = 0):

isCelebrity = true
Check if everyone knows person 0:
Person 1 knows person 0 (M[0][1] = 1), so isCelebrity becomes false.
Check if person 0 knows everyone:
Person 2 doesn't know person 0 (M[2][0] = 0), so isCelebrity remains false.
Iteration 2 (i = 1):

isCelebrity = false from the previous iteration.
Check if everyone knows person 1:
Person 0 doesn't know person 1 (M[1][0] = 0), so isCelebrity remains false.
Person 2 doesn't know person 1 (M[1][2] = 0), so isCelebrity remains false.
Check if person 1 knows everyone:
Person 0 knows person 1 (M[0][1] = 1), so isCelebrity remains false.
Person 2 doesn't know person 1 (M[2][1] = 1), so isCelebrity remains false.
Iteration 3 (i = 2):

isCelebrity = false from the previous iteration.
Check if everyone knows person 2:
Person 0 knows person 2 (M[2][0] = 0), so isCelebrity remains false.
Person 1 doesn't know person 2 (M[2][1] = 1), so isCelebrity remains false.
Check if person 2 knows everyone:
Person 0 knows person 2 (M[0][2] = 0), so isCelebrity remains false.
Person 1 doesn't know person 2 (M[1][2] = 0), so isCelebrity remains false.
Since no celebrity is found, the function returns -1.

User
I think the final answer should be 1, not -1. Everyone knows person 1 but person 1 knows no one.

M = [
         A  B  C
   A [0, 1, 0],
   B [0, 0, 0],
    C [0, 1, 0]
]
A knows B, C knows B but B does not know anyone of them. 
ChatGPT
You are correct, and I appreciate your clarification. I apologize for the oversight in my response. Let me correct it:

In the given matrix:

csharp
Copy code
M = [
    [0, 1, 0],
    [0, 0, 0],
    [0, 1, 0]
]
Person B (index 1) is indeed a celebrity because:

Person B (index 1) knows no one.
Everyone (Person A and Person C) knows Person B.
Therefore, the correct result should be 1, and the function should return 1 as the index of the celebrity. I appreciate your patience and thank you for pointing out the mistake.
 */

public class CelebrityProblem {

    static int celebrityNaive(int M[][], int n){
        for (int i = 0; i < n; i++) {
            boolean isCelebrity = true;
    
            // Check if M[i][j] is 1 for any j, indicating i knows someone
            for (int j = 0; j < n; j++) {
                if (i != j && M[i][j] == 1) {
                    isCelebrity = false;
                    break;
                }
            }
    
            // Check if everyone knows i, i.e., M[j][i] is 0 for any j
            for (int j = 0; j < n; j++) {
                if (i != j && M[j][i] == 0) {
                    isCelebrity = false;
                    break;
                }
            }
    
            if (isCelebrity) {
                return i;
            }
        }
    
        return -1;
    }

    static int celebrity(int M[][], int n)
    {
        //initializing two pointers for two corners.
        int a = 0;
        int b = n-1;
        
        //we keep moving till the a<b.
        while(a<b)
        {
            if(M[a][b] == 1)
                a++;
            else
                b--;
        }
        
        //checking if a is actually a celebrity or not.
        for(int i=0; i<n; i++)
        {
            //if any person doesn't know a or a knows any person, we return -1.
            if((i != a) && (M[a][i]==1 || M[i][a] == 0))
                return -1;
        }
        //if we reach here a is celebrity so we return a.       
        return a;
    }
    public static void main(String[] args) {
        int[][] M = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };

        int n = M.length;
        System.out.println(celebrity(M, n));
    }
}
