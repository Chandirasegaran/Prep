import java.util.Stack;

class NextLargest {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] soln = new long[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                soln[index] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            soln[index] = -1;
        }

        return soln;
    }

    public static void main(String[] args) {
        NextLargest obj = new NextLargest();
        long arr[] = new long[4];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 4;

        // Call the function and store the result in a variable
        long[] result = obj.nextLargerElement(arr, 4);

        // Print the result
        for (int i = 0; i < 4; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}


// import java.util.Stack;

// class GFG {
//     public static long[] nextLargerElement(long[] arr, int n)
//     {     
//         long[] soln = new long[n];
//         Stack<Integer> stack = new Stack<>();

//         for (int i = 0; i < n; i++) {
            
//             while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
//                 int index = stack.pop();
//                 soln[index] = arr[i];
//             }
//             stack.push(i);
//         }

//         while (!stack.isEmpty()) {
//             int index = stack.pop();
//             soln[index] = -1;
//         }

//         for (int i=0;i<n;i++){
//             System.out.println(soln[i]);
//         }
//     } 
//     public static void main (String[] args){
//         GFG obj=new GFG();
//         long arr[] = new long[4];
//         arr[0]=1;
//         arr[1]=3;
//         arr[2]=2;
//         arr[3]=4;
//         System.out.println(obj.nextLargerElement(arr, 4));
//     }
// }
