package Challenges;

public class ArmStrongNumberTest {

    public static boolean isArmstrongNumber(int N) {
        String numStr = Integer.toString(N);

        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Integer.parseInt(numStr.substring(i,i+1));
            sum += (int) Math.pow(digit, 3);
        }
        return sum == N;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(407 ));
    }

}
