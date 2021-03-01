package com.aca;

public class HousePrice {
    public static void main(String[] args) {
        int totalSqFeet     = 2000;
        int pricePerSqFt    = 110;
        int homePrice       = pricePerSqFt * totalSqFeet;

        System.out.println("home price: " + homePrice);
        System.out.println("home price when sqFeet = " + totalSqFeet + " and pricePerSqFt = " + pricePerSqFt + " : " + homePrice);

        pricePerSqFt    = 102;
        homePrice       = pricePerSqFt * totalSqFeet;

        System.out.println("home price: " + homePrice);
        System.out.println("home price when sqFeet = " + totalSqFeet + " and pricePerSqFt = " + pricePerSqFt + " : " + homePrice);
    }
}
