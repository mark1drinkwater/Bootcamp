/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter2;

/**
 *
 * @author Mark
 */
public class CandyCounter {

    static long addCandy(double fruit, float vegetables) {
        return (int) (fruit + vegetables);
    }

    public static void main(String[] args) {
        System.out.print(addCandy(1.4, 2.4f) + ", ");
        System.out.print(addCandy(1.9, (float) 4) + ", ");
        System.out.print(addCandy((long) (int) (short) 2, (float) 4));

        int start = 7;
        int end = 4;
        end += ++start;
        start = Byte.MAX_VALUE + 1;
        System.out.println(start);
        System.out.println(end);
    }
}
