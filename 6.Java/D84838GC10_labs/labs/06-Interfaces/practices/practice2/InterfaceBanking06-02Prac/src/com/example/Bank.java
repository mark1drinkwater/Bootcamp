package com.example;

public class Bank implements BankOperations {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    @Override
    public void addCustomer(String f, String l,Branch b) {
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l,b);
    }

    @Override
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    @Override
    public Customer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}