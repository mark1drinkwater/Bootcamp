package Fun;

public class Palindrome {

    public boolean isPalindrome(String word1, String word2) {

        String word1Reversed = "";
        for (int i = word1.length(); i > 0; i--) {
            word1Reversed += word1.charAt(i);
        }

        if (word1Reversed.equals(word2))
            return true;
        return false;

    }
}
