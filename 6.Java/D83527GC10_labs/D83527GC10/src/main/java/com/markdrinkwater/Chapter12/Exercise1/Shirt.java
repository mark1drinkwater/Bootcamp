/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.markdrinkwater.Chapter12.Exercise1;

/**
 *
 * @author Mark
 */
public class Shirt extends Item {
    
    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
      super("Shirt", price);
      this.size = size;
      this.colorCode = colorCode;
           
    }  
  
}
