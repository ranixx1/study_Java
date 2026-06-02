package algoritmos;

public class NumberIsPalindromo {
    class Solution {
        public boolean isPalindrome(int x) {
            String n = String.valueOf(x);
            int t = n.length();

            for (int i = 0; i < t / 2; i++) {
                if (n.charAt(i) != n.charAt(t - 1 - i)) {
                    return false;
                }
            }

            return true;
        }
    }
}
