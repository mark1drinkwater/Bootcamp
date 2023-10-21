package Challenges;

public class IsRepeatCharacters {

    public static boolean isRepeatCharacters(String s) {
        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.toUpperCase().charAt(i) - 65;

            if (ascii < 0)
                continue;

            chars[ascii]++;

            if (chars[ascii] > 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRepeatCharacters("hello"));
        System.out.println(isRepeatCharacters("hello"));
        System.out.println(isRepeatCharacters("helo"));
        System.out.println(isRepeatCharacters("heLLLllo"));
        System.out.println(isRepeatCharacters("helo world"));
    }

    /*
    SELECT * FROM tblCustomer JOIN tblPayment ON tblCustomer.ID = tblPayment.ID
        WHERE p.PaymentDate IS NULL OR p.PaymentDate < DATEADD(MONTH, -3, GETDATE())
     */

}
