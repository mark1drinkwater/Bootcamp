package Challenges;

class BinaryDigit1 {
    public static int solution(int N) {
        // Implement your solution here
        String binaryStr = Integer.toBinaryString(N);

        int countZeros = 0;
        int mostZeros = 0;
        boolean startOne = false;
        boolean endOne = false;

        System.out.print("Binary String: " + binaryStr);

        for (int i = 0; i < binaryStr.length(); i++) {
            char b = binaryStr.charAt(i);

            if (startOne) {
                if (b == '1') {
                    endOne = true;
                } else {
                    countZeros++;
                }
            } else {
                if (b == '1') {
                    startOne = true;
                }
            }

            if (countZeros > mostZeros && (startOne && endOne) ) {
                mostZeros = countZeros;
            }

            if (endOne) {
                countZeros = 0;
                startOne = false;
                endOne = false;
            }

        }

        System.out.printf(" Most Zeros: %d        Count Zeros: %d%n", mostZeros, countZeros);

        return mostZeros;
    }

    public static void main(String[] args) {
            solution(805306373);
    }
}