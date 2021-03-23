package com.aca;

public class Address {
    private String city;
    private String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }
    
    public String getState() {
        return this.state;
    }

    public Address changeState(String state){
        return new Address(this.city, state);
    }

    public Address changeCity(String city){
        return new Address(city, this.state);
    }
}