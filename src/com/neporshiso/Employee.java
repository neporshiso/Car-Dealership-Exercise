package com.neporshiso;

public class Employee {

    private String name;
    private int carsSold;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarsSold() {
        return carsSold;
    }

    public void setCarsSold(int carsSold) {
        this.carsSold = carsSold;
    }

    public static void runCreditHistory(Customer cust, double financedAmount) {
        System.out.println("Credit History Ran");
    }

    public static void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("The " + vehicle.getYear() + " " + vehicle.getMake() + vehicle.getModel() + " was sold!");
        System.out.println("Congratulations " + cust.getName() + " !");
    }

    public static void handleCustomer(Customer cust, boolean finance, Vehicle vehicle ) {
        System.out.println(cust.getName());
//        if (finance) {
//
//            double financedAmount = vehicle.getPrice() - cust.getCashOnHand();
//
//            runCreditHistory(cust, financedAmount);
//
//        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
//
//            processTransaction(cust, vehicle);
//
//        } else {
//            System.out.println("Customer needs more money");
//        }
    }

}
