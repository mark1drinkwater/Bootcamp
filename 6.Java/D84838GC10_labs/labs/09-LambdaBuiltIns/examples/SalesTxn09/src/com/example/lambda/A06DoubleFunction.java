package com.example.lambda;

import java.util.function.DoubleFunction;

public class A06DoubleFunction {

  public static void main(String[] args) {
        
    A06DoubleFunction test = new A06DoubleFunction();
        
    // Here we take pass in a Double parameter and return a Generic (String).
    // It's still technically a function (take in 1 parameter (double) and return another generic).
    
    DoubleFunction<String> calc = 
          t -> String.valueOf(t * 3);
        
    String result = calc.apply(20);
    System.out.println("New value is: " + result);        
  }      
}
