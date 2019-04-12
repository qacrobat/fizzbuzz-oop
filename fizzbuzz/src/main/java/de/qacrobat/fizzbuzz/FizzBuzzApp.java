package de.qacrobat.fizzbuzz;

public class FizzBuzzApp {
    private static final int LAST_NUMBER = 100;
    private FizzBuzzPlayer player1;

    public static void main(String[] args) {
        new FizzBuzzApp().runFizzBuzzGame();
    }

    void runFizzBuzzGame() {
        player1 = new FizzBuzzPlayer();

        for (int i = 1; i <= LAST_NUMBER; i++) {
            System.out.print(player1.determineWord(i));

            if (i < LAST_NUMBER) {
                System.out.print(", ");
            }
        }
    }



}
