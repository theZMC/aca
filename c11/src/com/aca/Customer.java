package com.aca;

public class Customer extends Person {
    private String companyName;
    private Integer number;

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
