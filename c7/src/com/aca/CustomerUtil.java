package com.aca;

public class CustomerUtil {
    public static Customer[] getCustomers() {
        Customer[] customers = new Customer[3];

        Customer cust1 = new Customer("Tom", "Texas");
        Customer cust2 = new Customer("Dick", "Oklahoma");
        Customer cust3 = new Customer("Harry", "Arkansas");

        customers[0] = cust1;
        customers[1] = cust2;
        customers[2] = cust3;

        return customers;
    }
}
