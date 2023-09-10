//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class CelebrityProblem{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        int t=4;
        while(t>0)
        {
            // int N = sc.nextInt();
            int N=4;
            int[][] M = {
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 0}
            };
            
            // int M[][] = new int[N][N];
            // for(int i=0; i<N; i++)
            // {
            //     for(int j=0; j<N; j++)
            //     {
            //         M[i][j] = sc.nextInt();
            //     }
            // }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution
{ 
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        int candidate = 0; // Assume the first person as the candidate
        
        // Check if the candidate knows someone or someone doesn't know the candidate
        for (int i = 1; i < n; i++) {
            if (M[candidate][i] == 1) {
                candidate = i; // Update the candidate if they know someone
            }
        }
        
        // Check if the candidate is known by everyone (except themselves)
        for (int i = 0; i < n; i++) {
            if (i != candidate && (M[candidate][i] == 1 || M[i][candidate] == 0)) {
                return -1; // If not, return -1
            }
        }
        
        return candidate; // If the candidate satisfies the conditions, return the candidate
    }
}


// class Solution
// { 
//     //Function to find if there is a celebrity in the party or not.
//     int celebrity(int M[][], int n)
//     {
//         int soln[][] = new int[n][2];
//         int count=0;
//         Stack <Integer> stack = new Stack<>();
//     	// code here 
//     	for(int i=0;i<n;i++){
//     	    for(int j=0;j<n;j++){
//     	        if(M[j][i]==1){
//                     if(i==j){
//                         continue;
//                     }
//                     else{
//                         count++;
//                     }
//     	        }
//     	    }
//     	    if(count>1){
//     	        stack.push(i);
//     	    }
//     	    count=0;
//     	}
//     	if (stack.isEmpty()){
//     	    return -1;
//     	}
        
//     	int ans=stack.pop();
//     	return ans;

        

//     }
// }
