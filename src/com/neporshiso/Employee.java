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

    public static void runCreditHistory(Customer cust, double doubleAmount) {

    }

    public static void processTransaction(Customer cust, Vehicle vehicle) {

    }

    public static void handleCustomer(Customer cust, boolean finance, Vehicle vehicle ) {
        if (finance) {
            // can also make use of cust.creditscore
            // doubleAmount is the difference between vehicle price and customer's cash on hand


            runCreditHistory(cust, doubleAmount) {
                System.out.println(cust + doubleAmount);
            }

        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            processTransaction(Customer cust, Vehicle vehicle);
        } else {
            System.out.println("Customer needs more money");
        }
    }

}
