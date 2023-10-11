package com.example;

public interface AccountOperations {
  double getBalance();
  void deposit(double amount);
  boolean withdraw(double amount);
  String getDescription();
}
