package com.aca;

public class CountDown {
    public static void main(String[] args) {
        int j;
        
        for(int i = 100; i > -101; i -= 8){
            System.out.println(i);
        }
        
        j = 100;
        while(j > -101){
            System.out.println(j);
            j -= 8;
        }

        j = 100;
        do{
            System.out.println(j);
            j -= 8;
        }
        while(j > -101);
    }
}
