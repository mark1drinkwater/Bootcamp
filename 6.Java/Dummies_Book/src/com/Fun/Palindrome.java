package com.Fun;

public class Palindrome {

    public boolean isPalindrome(String word1, String word2) {

        String word1Reversed = "";
        for (int i = word1.length()-1; i >= 0; i--) {
            word1Reversed += word1.charAt(i);
        }

        System.out.println(word1Reversed + " || " + word2);

        if (word1Reversed.equals(word2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Palindrome pal1 = new Palindrome();
        System.out.println(pal1.isPalindrome("mah", "ham"));
    }
}
