package com.aca;

public class IntByZero {
    public static void main(String[] args) {
        int first   = 42;
        int second  = 0;
        int result  = first / second;
        
        System.out.println(result); // will compile but will not run. divide by zero.
    }
}
