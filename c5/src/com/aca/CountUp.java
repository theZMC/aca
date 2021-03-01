package com.aca;

public class CountUp {
    public static void main(String[] args) {
        for(int i=0; i < 101; i += 10){
            System.out.println(i);
        }

        int j = 0;
        while(j < 101){
            System.out.println(j);
            j += 10;
        }

        j = 0;
        do{
            System.out.println(j);
            j += 10;
        }
        while(j < 101);
    }
}
