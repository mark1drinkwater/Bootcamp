/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter2;

/**
 *
 * @author Mark
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1
        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance--); // 1
        System.out.println(parkAttendance); // 0
        
        System.out.println(--(parkAttendance) );
        System.out.println(parkAttendance);
    }
    
}
