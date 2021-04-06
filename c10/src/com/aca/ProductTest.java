package com.aca;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Green Beans", LocalDate.now(), new BigDecimal(12.00));
        Product product2 = new Product("Carrots", LocalDate.now(), new BigDecimal(2.36));
        Product product3 = new Product("Ground Beef", LocalDate.now(), new BigDecimal(13.78));

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        product1.stock(24);
        product2.stock(20);
        product3.stock(4);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        product1.sell(10);
        product2.sell(2);
        product3.sell(1);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        System.out.println(product1.getTotalUnitValue().setScale(2, RoundingMode.DOWN));
        System.out.println(product2.getTotalUnitValue().setScale(2, RoundingMode.DOWN));
        System.out.println(product3.getTotalUnitValue().setScale(2, RoundingMode.DOWN));
    }
}
