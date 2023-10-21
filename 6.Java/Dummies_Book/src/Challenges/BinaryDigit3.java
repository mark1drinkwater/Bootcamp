package Challenges;

public class BinaryDigit3 {

    public static int solution(int N) {
        String bString = Integer.toBinaryString(N);
        System.out.print(bString + "\t");

        boolean started = false;
        int counter = 0;
        int maxCounter = 0;

        for (int i=0; i <bString.length(); i++) {
            char c = bString.charAt(i);
            if (c == '1') {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
                counter = 0;
                started = true;
            } else {
                counter++;
            }

        }
        return maxCounter;
    }

    public static void main(String[] args) {
        System.out.println(solution(146615353));
    }

}
