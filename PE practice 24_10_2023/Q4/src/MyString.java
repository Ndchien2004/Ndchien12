
import java.util.Stack;
import java.util.StringTokenizer;
public class MyString implements IString {

    @Override
    public int f1(String str) {
         int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isPrimeDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            stack.push(word);
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();
    }
    
     private boolean isPrimeDigit(char ch) {
        if (ch >= '2' && ch <= '7') {
            return (ch == '2' || ch == '3' || ch == '5' || ch == '7');
        }
        return false;
    }

   
    private String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
