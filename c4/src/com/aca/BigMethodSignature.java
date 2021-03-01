package com.aca;

public class BigMethodSignature {
    public static void printSum(int val1, int val2, int val3, int val4, int val5,
                                int val6, int val7, int val8, int val9, int val10){
        
        System.out.printf("%d\n", val1 + val2 + val3 + val4 + val5 +
                                val6 + val7 + val8 + val9 + val10);
    }

    public static void main(String[] args) {
        printSum(1,2,3,4,5,6,7,8,9,10);
        printSum(2,4,6,8,10,12,14,16,18,20);
    }
}
