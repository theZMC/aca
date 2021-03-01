package com.aca;

public class For {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 4; i++){
            System.out.println("Outer Loop i=" + i);
            for(int j = 0; j < 4; j++){
                System.out.print("\tInner Loop j=" + j);
                System.out.println("\t\tTotal num="+ (++num));
            }
        }
    }
}
