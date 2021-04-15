package com.aca;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Product {
    private String name;
    private int quantityInStock;
    private LocalDate createDate;
    private BigDecimal unitPrice;

    public Product(String name, LocalDate createDate, BigDecimal unitPrice) {
        this.name = name;
        this.createDate = createDate;
        this.unitPrice = unitPrice;
    }

    public void stock(int amount) {
        quantityInStock += amount;
    }

    public void sell(int amount) {
        quantityInStock -= amount;
    }

    public void recordLoss(int amount) {
        sell(amount);
    }

    public BigDecimal getTotalUnitValue() {
        return unitPrice.multiply(new BigDecimal(quantityInStock)).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public String toString() {
        return String.format("%s, Quantity in Stock %s, Unit price is $%s, and Create date %s.", name, quantityInStock,
                unitPrice.setScale(2, RoundingMode.DOWN), createDate);
    }

    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
