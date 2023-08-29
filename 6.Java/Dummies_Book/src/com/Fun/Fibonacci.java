package com.Fun;

public class Fibonacci {

    public static void main (String[] args) {
        System.out.println( fib(5) );
//        System.out.println( fact(5) );
    }

    public static int fib(int n) {
        if (n >= 3) {
            return fib(n-1) + fib(n-2);
        } else {
            return 1;
        }
    }

    public static int fact (int n) {
        if (n >= 1) {
            return n * fact(n-1);
        } else {
            return 1;
        }
    }

}
