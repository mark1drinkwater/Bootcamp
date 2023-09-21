package com.example.java_dummies_book6.OCP;

public class PatternMatching
{
    public static void main(String[] args) {
        //197

    }

    void printIntegersOrNumbersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.print(data);
        }
    }

}
