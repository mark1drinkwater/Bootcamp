package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {
    // Setup Executor
    ExecutorService es = Executors.newCachedThreadPool();
    
    // Submit Runnable
    CountRunnable A = new CountRunnable("A", 20);
    CountRunnable B = new CountRunnable("B", 20);
    CountRunnable C = new CountRunnable("C", 20);
    
    es.submit(A);
    es.submit(B);
    es.submit(C);
    
    // Showndown ExectuorService
    es.shutdown();
  }
}
