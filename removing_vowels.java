import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            while (i < j && !vowels.contains(chars[i])) i++;
            while (i < j && !vowels.contains(chars[j])) j--;

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        return new String(chars);
    }
}
