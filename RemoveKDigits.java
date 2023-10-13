import java.util.Stack;

public class RemoveKDigits {
    public static String removekdi(String S, int K) {
        Stack<Character> stack = new Stack<>();
        
        for (char digit : S.toCharArray()) {
            while (K > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                K--;
            }
            stack.push(digit);
        }
        
        // Remove remaining digits if K is still greater than 0
        while (K > 0) {
            stack.pop();
            K--;
        }
        
        // Convert the stack to a string and remove leading zeroes
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        // Remove leading zeroes
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        // If the result is empty, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String S1 = "149811";
        int K1 = 3;
        System.out.println(removekdi(S1, K1)); // Output: "111"

        // Example 2
        String S2 = "1002991";
        int K2 = 3;
        System.out.println(removekdi(S2, K2)); // Output: "21"
    }
}
