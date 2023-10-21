package Challenges;

public class BinaryDigit2 {



    public static int binaryGap(int N) {
        int mostZeros = 0;
        String binaryString = Integer.toBinaryString(N);

        System.out.println("Binary String: " + binaryString);

        while (binaryString.length() > 0) {
            int onePos = binaryString.indexOf("1");
            int oneNextPost = binaryString.indexOf("1", onePos+1);

            int zeroDigits = oneNextPost - onePos - 1;

            System.out.printf("onePost:%d oneNextPos%d", onePos, oneNextPost);

            if (zeroDigits > 0) {
                System.out.println("\nThere are this many zero digits " + zeroDigits);
            } else {
                System.out.println("\nCould not form a sequence");
            }

            if (zeroDigits > mostZeros) {
                mostZeros = zeroDigits;
            }

            if (oneNextPost != -1)
                binaryString = binaryString.substring(oneNextPost);
            else
                binaryString = "";
        }
        System.out.println("Most zeros: " + mostZeros);
        return mostZeros;
    }

    public static void main(String[] args) {
        binaryGap(32);
    }

}
