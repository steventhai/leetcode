import java.util.Map;

/**
 * 242
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);    
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null) {
                return false;
            }

            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        
        return true;
    }
}