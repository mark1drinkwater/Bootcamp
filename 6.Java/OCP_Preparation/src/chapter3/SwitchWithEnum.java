/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3;

/**
 *
 * @author Mark
 */
public class SwitchWithEnum {

    static enum Season {
        WINTER, SPRING, FALL, SUMMER
    };
    
    public static void main(String[] args) {
        System.out.println(getWeather(Season.FALL));
    }
    
    static String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "cold";
            case SPRING -> "warming up";
            case FALL -> "cooling down";
            case SUMMER -> "hot";
        };
        
    }
    
}
