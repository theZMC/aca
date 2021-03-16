package com.aca;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] = 11;
        array[3] = 11;
        array[9] = 11;

        printArray(array);
        System.out.println(arrayTotal(array));
        System.out.println(arrayMax(array));
        System.out.println(arrayMaxIndex(array));

        double[] dArray = new double[5];
        dArray[0] = 1.3341;
        dArray[1] = 1.9139;
        dArray[2] = 1.8861;
        dArray[3] = 1.3313;
        dArray[4] = 1.2213;

        System.out.println(arrayAverage(dArray));
    }

    public static void printArray(int[] array) {
        System.out.println("{");
        for(int i = 0; i < array.length; i++){
            System.out.printf("  %d,\n", array[i]);
        }
        System.out.println("}");
    }

    public static int arrayTotal(int[] array) {
        int out = 0;
        for(int i = 0; i < array.length; i++){
            out += array[i];
        }
        return out;
    }

    public static int arrayMax(int[] array) {
        int out = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            out = Math.max(array[i], out);
        }        
        return out;
    }

    public static int arrayMaxIndex(int[] array){
        int index = 0;
        for(int i = 0; i < array.length; i++){
            index = array[index] > array[i] ? index : i;
        }
        return index;
    }

    public static double arrayAverage(double[] array) {
        double total = 0.0d;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            total = total + array[i];
            count++;
        }
        return total / (double) count;   
    }
}
