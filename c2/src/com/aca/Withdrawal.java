package com.aca;

public class Withdrawal {
    public static void main(String[] args) {
        
        int withdrawal  = 137;
        System.out.printf("\nWithdrawal: %d\n\n", withdrawal);

        int denom20     = withdrawal / 20;
        withdrawal      = withdrawal % 20;
        
        int denom10     = withdrawal / 10;
        withdrawal      = withdrawal % 10;
        
        int denom5      = withdrawal / 5;
        
        int denom1      = withdrawal % 5;

        System.out.println("Denomination\tQty");
        System.out.println("------------\t---");
        System.out.printf("$20\t\t%d\n",    denom20);
        System.out.printf("$10\t\t%d\n",    denom10);
        System.out.printf("$5\t\t%d\n",     denom5);
        System.out.printf("$1\t\t%d\n\n",   denom1);
    }
}
