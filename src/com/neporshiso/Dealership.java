package com.neporshiso;

public class Dealership {
    /*
     Write a program to simulate a car dealership sales process. We'll have employees working to sell vehicles to
     customers.

     Think of nouns when dealing with OOP. Dealership, Employees, Vehicles, Customers
    */

    public static void main(String[] args) throws Exception {
        // Instantiate Customer, Vehicle, and Employee
        Customer customer1 = new Customer();
        customer1.setName("Voldemort");
        customer1.setAddress("123 Bad Guy Lane");
        customer1.setCashOnHand(100000);
        customer1.setCreditScore(750);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setMake("Honda");
        vehicle1.setModel("CR-V");
        vehicle1.setPrice(29000);
        vehicle1.setYear(2019);

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setMake("Honda");
        vehicle2.setModel("CR-V");
        vehicle2.setPrice(29000);
        vehicle2.setYear(2019);

        boolean vehicleComparison = vehicle1.equals(vehicle2);
        System.out.println("vehicleComparision is " + vehicleComparison);

        Employee employee1 = new Employee();
        employee1.setCarsSold(9);
        employee1.setName("Harry");


        /*
         Really didn't think that I could pass in the instantiated object to a method belonging to the same object.
         I'm doing this because in order for employee1 to invoke handleCustomer within customer's purchaseCar method, I
         need access to the customer object...

         No need to do that... can refer to this. this points to customer1 and can use that within customer1 methods.
        */
        System.out.println(employee1.getCarsSold()); // 9
        customer1.purchaseCar(vehicle1, employee1, true);

        // After selling the car, we use the setCarsSold method to
        // increment employee1 sales count
        System.out.println(employee1.getCarsSold()); // 10

    }


}
