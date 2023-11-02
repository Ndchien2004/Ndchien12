import java.util.HashSet;
import java.util.Set;


public class MyString implements IString {
  private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    @Override
    public int f1(String str) {
        String[] words = str.split(" ");
        int sumLength = 0;

        for (String word : words) {
            if (word.length() >= 2 && !isPalindrome(word)) {
                sumLength += word.length();
            }
        }
        return sumLength;
    }

    @Override
    public String f2(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
    
}
