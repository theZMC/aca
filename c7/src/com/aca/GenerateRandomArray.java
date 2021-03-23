package com.aca;

import java.util.Arrays;
import java.util.Random;

public class GenerateRandomArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArray(10)));
        System.out.println(Arrays.toString(randomArray(20)));
        System.out.println(Arrays.toString(randomArray(30)));
    }

    private static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
