package com.neporshiso;

public class Dealership {
    /*
     Write a program to simulate a car dealership sales process. We'll have employees working to sell vehicles to
     customers.

     Think of nouns when dealing with OOP. Dealership, Employees, Vehicles, Customers
    */

    public static void main(String[] args) {
        // Instantiate Customer, Vehicle, and Employee
        Customer customer1 = new Customer();
        customer1.setName("Voldemort");
        customer1.setAddress("123 Bad Guy Lane");
        customer1.setCashOnHand(6000);
        customer1.setCreditScore(750);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setMake("Honda");
        vehicle1.setModel("CR-V");
        vehicle1.setPrice(29000);
        vehicle1.setYear(2019);

        Employee employee1 = new Employee();
        employee1.setCarsSold(9);
        employee1.setName("Harry");

        System.out.println(customer1.getCashOnHand());
        System.out.println(vehicle1);
        System.out.println(employee1);

        // Really didn't think that I could pass in the instantiated object to a method belonging to its class. I'm
        // doing this because in order for employee1 to invoke handleCustomer within customer's purchaseCar method, I
        // need access to the customer object.
        customer1.purchaseCar(customer1, vehicle1, employee1, false);
    }


}
