package com.aca;

public class Cast {
    public static void main(String[] args) {
        byte b1, b2, b3;

        int i       = 3;
        int j       = 201;
        double x    = 4.999;

        b1 = (byte)i;
        b2 = (byte)j;
        b3 = (byte)x;

        /*  Byte has 8 bits and can store the value
            3 without modification, as it's between
            -128 and 127. */
        System.out.println("b1: " + b1); // Outputs 3

        /*  Since byte can only store up to 127 signed,
            the integer 201 overflows. 201 is represented
            by 11001001, but since the byte is signed, the
            most significant bit indicates a negative 128, 
            meaning the actual value stored is 1001001 
            (plus a sign bit) which is a binary 73, and 
            since it's a negative, 73 is added to -128, 
            giving us -55. */
        System.out.println("b2: " + b2); // Outputs -55

        /*  When casting from a floating point, Java
            always rounds down, meaning 4.999 rounds down
            to a 4. Since 4 is between -128 and 127, 4
            can be stored in a byte without modification. */
        System.out.println("b3: " + b3); // Outputs 4

        /*  Int can't store values higher than 2147483647
            unsigned and the compiler itself won't allow
            a literal longer than that value without an "L"
            appended to the end. A long can hold the value, 
            however, as it has 64 bits instead of 32. 
            This code will not compile since the compiler 
            can't accept the literal. */
        // int size;
        // size = 999_999_999_000;

        /*  We can force it to compile by adding an L to the
            end and casting to int, but it will overflow. */
        int size;
        size = (int) 999_999_999_000L; // Overflows to -727380968
        System.out.println(size);

        /*  This code actually stores the correct value. */
        long lsize;
        lsize = 999_999_999_000L;
        System.out.println(lsize);

        /*  Won't compile as 2.0 is a literal double, not a
            literal float. */
        // float myValue;
        // myValue = 2.0;

        /*  We specify a float literal with an appended f. */
        float myValue;
        myValue = 2.0f;
        System.out.println(myValue);

        /*  Or we can cast the literal double 2.0 to a float,
            but we could lose precision, so it's not recommended. */
        myValue = (float) 2.0;
        System.out.println(myValue);
    }
}
