package com.aca;
public class Logic {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        boolean yes = true;
        boolean no  = false;

        System.out.println("Both Yes/Yes True: " + (yes && yes));
        System.out.println("Both Yes/No True: " + (yes && no));

        System.out.println("Either Yes/Yes True: " + (yes || yes));
        System.out.println("Either Yes/No True: " + (yes || no));
        System.out.println("Either No/No True: " + (no || no));

        System.out.println("Original Yes Value: " + yes);
        System.out.println("Inverse Yes Value: " + !yes);
    }
}
