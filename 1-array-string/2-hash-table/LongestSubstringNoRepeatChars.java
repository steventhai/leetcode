import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3
 * 
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Examples:
 * 
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringNoRepeatChars {

    public int lengthOfLongestSubstringUsingSet(String s) {
        Set<Character> exist = new HashSet<>();
        int result = 0;
        int i = 0; 
        int j = 0;
        int length = s.length();

        while (i < length && j < length) {

            if (!exist.contains(s.charAt(j))) {
                result = Math.max(result, j - i + 1);
                exist.add(s.charAt(j++));
            } else {
                exist.remove(s.charAt(i++));
            }
        }

        return result;
    }

    public int lengthOfLongestSubstringUsingMap(String s) {
        Map<Character, Integer> exist = new HashMap<>();
        int result = 0;
        int length = s.length();

        for (int j = 0, i = 0; j < length; j++) {
            if (exist.containsKey(s.charAt(j))) {
                i = Math.max(i, exist.get(s.charAt(j)));
            }
            result = Math.max(result, j - i + 1);
            exist.put(s.charAt(j), j + 1);
        }

        return result;
    }
}

    
