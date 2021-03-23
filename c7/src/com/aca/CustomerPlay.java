package com.aca;

public class CustomerPlay {
    public static void main(String[] args) {
        Customer[] customers = CustomerUtil.getCustomers();

        for(Customer cust : customers){
            System.out.println(cust.getName());
            System.out.println(cust.getState());
            System.out.println(cust.getCustomerInfo());
        }
    }
}
