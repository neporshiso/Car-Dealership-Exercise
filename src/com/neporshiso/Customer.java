package com.neporshiso;

public class Customer {

    private String name;
    private String address;
    private double cashOnHand;
    private int creditScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) throws Exception {
        if (creditScore > 850 || creditScore < 300) throw new Exception("Credit scores must be between 300 and 850");
        this.creditScore = creditScore;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        emp.handleCustomer(emp, this, finance, vehicle);
    }
}
