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

    public static boolean runCreditHistory(Customer cust, double financedAmountRequired) {
        int custCredit = cust.getCreditScore();
        double approvedAmount = 0;
        boolean isApproved;

        if (custCredit <= 850 && custCredit >= 700 ) {
            approvedAmount = 20000;
        } else if (custCredit <= 699 && custCredit >= 600 ) {
            approvedAmount = 10000;
        } else if (custCredit <= 599 && custCredit >= 300) {
            approvedAmount = 5000;
        }

        isApproved = approvedAmount < financedAmountRequired ?  false : true;
        return isApproved;
    }

    public static void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("The " + vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel() + " was " +
                "sold!");
        System.out.println("Congratulations " + cust.getName() + "!");
    }

    public static void handleCustomer(Employee emp, Customer cust, boolean finance, Vehicle vehicle ) {

        if (finance) {

            double financedAmountRequired = vehicle.getPrice() - cust.getCashOnHand();

            boolean isApproved = runCreditHistory(cust, financedAmountRequired);

            if (isApproved) {
                int employeeCarsSold = emp.getCarsSold();
                emp.setCarsSold(employeeCarsSold + 1);
                processTransaction(cust, vehicle);
            }
            else {
                System.out.println("Customer needs more money");
            }

        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            int employeeCarsSold = emp.getCarsSold();
            emp.setCarsSold(employeeCarsSold + 1);
            processTransaction(cust, vehicle);

        } else {

            System.out.println("Customer needs more money");
        }

    }

}
