package com.Fun;

public class IsUnique {

    // O(n) time
    public boolean isUnique(String sen) {

        if (sen.length() > 128) return false;

        boolean char_set[] = new boolean[128];

        for (int i = 0; i < sen.length(); i++) {
            // Gets the 1st character then the 2nd.. 3rd.. 4th.. 5th.. etc.
            int val = sen.charAt(i);
            // Char consists of 2 bytes so e.g. the value of s is 115.

            // When we lookup s it'll be false the first time & true the second time.
            if (char_set[val])
                return false;

            // Then set the corresponding position of s in the bool array to true
            char_set[val] = true;
        }
        return true;
    }

    // O(n^2) time
    public boolean isUnique2(String sen) {
        for (int i = 0; i < sen.length(); i++) {
            for (int j = i+1; j < sen.length(); j++) {
                if (sen.charAt(i) == sen.charAt(j)) {
                    System.out.println("Not unique cz of " + i + " | " + j );
                    return false;
                }
            }
        }
        return true;
    }

    public static void main (String[] args) {
        IsUnique test1 = new IsUnique();
//        System.out.println(test1.isUnique("sandy"));
//        System.out.println(test1.isUnique("sandy sea"));

        System.out.println(test1.isUnique2("sandy"));
        System.out.println(test1.isUnique2("sandy sea"));
    }

}
