package com.aca;

public class MathUtil {
    public static void main(String[] args) {
        System.out.println(absoluteSum(10,-20));
        System.out.println(absoluteSum(0,-1));
        System.out.println(absoluteSum(-12,12));
        
        System.out.println(absoluteSum(10,-20,13));
        System.out.println(absoluteSum(0,-1,-9));
        System.out.println(absoluteSum(-12,12,-22));
    }
    private static int absoluteSum(int num1, int num2) {
        return Math.abs(num1)+Math.abs(num2);
    }
    private static int absoluteSum(int num1, int num2, int num3) {
        return Math.abs(num1)+Math.abs(num2)+Math.abs(num3);
    }
}
