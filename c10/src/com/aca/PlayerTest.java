package com.aca;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Tom");
        Player player2 = new Player("Dick");
        Player player3 = new Player("Harry");

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        player1.increaseScore();
        player1.increaseScore();
        player1.increaseScore();

        player2.increaseScore();

        player3.increaseScore();
        player3.increaseScore();
        player3.increaseScore();
        player3.increaseScore();
        player3.increaseScore();
        player3.increaseScore();
        player3.increaseScore();

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        player1.resetScore();
        player2.resetScore();
        player3.resetScore();

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }
}


