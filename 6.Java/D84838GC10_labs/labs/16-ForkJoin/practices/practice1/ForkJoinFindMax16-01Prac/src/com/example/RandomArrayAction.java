/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Mark
 */
public class RandomArrayAction extends RecursiveAction {
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;
    
    public RandomArrayAction(int[] myArray, int start, int end, int threshold) {
        this.threshold = threshold;
        this.start = start;
        this.end = end;
        this.myArray = myArray;
    }
    
    @Override
    protected void compute() {
        if (end - start < threshold) {
            for (int i = start; i <= end; i++) {
//               https://www.baeldung.com/java-thread-local-random
                myArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int midway = (end - start) / 2 + start;
            RandomArrayAction r1 = new RandomArrayAction(myArray, start, midway, threshold);
            RandomArrayAction r2 = new RandomArrayAction(myArray, midway+1, end, threshold);
            invokeAll(r1, r2);
        }
    }
    
}
