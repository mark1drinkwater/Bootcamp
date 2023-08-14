
package com.markdrinkwater.Chapter08.Exercise1;

public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char color) {
        if (color == ' ') {
            return false;
        } else {
            this.color = color;
            return true;
        }
    }
    
}
