package de.qacrobat.fizzbuzz;

public class FizzBuzzApp {
    private FizzBuzzPlayer player1;

    public static void main(String[] args) {
        new FizzBuzzApp().runFizzBuzzGame(5);
    }

    void runFizzBuzzGame(int numberOfPlayers){
        FizzBuzzGame game = new FizzBuzzGame();

        for (int j = 0; j < numberOfPlayers; j++){
            game.addPlayer(new FizzBuzzPlayer());
        }

        game.startGame();
    }





}
