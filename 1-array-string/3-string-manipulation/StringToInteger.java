/**
 * 8
 * 
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * 
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, 
 * takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains 
 * only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned. 
 * If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */
public class StringToInteger {

    public int myAtoi(String str) {
        
        String trim = str.trim();
        if (trim.isEmpty()) return 0;
        int length = trim.length();
        
        // Check first character for + or -.
        long result = 0;
        int i = 0;
        int sign = 1;
        char first = str.charAt(0);
        if (first < '0') {
            i++;
            if (first == '-') {
                sign = -1;
            } else if (first != '+') {
                return 0;
            }
        }

        // Going through the rest of the characters.
        while (i < length) {
            int digit = str.charAt(i++) - '0';
            if (digit < 0 || digit > 9) break;
            
            result = 10 * result + digit;

            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if (sign == -1 && sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) result * sign;
    }
}