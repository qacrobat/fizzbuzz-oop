package de.qacrobat.fizzbuzz;

public class FizzBuzzApp {

    public static void main(String[] args) {
        new FizzBuzzApp().runFizzBuzzGame(5);
    }

    public void runFizzBuzzGame(int numberOfPlayers){
        FizzBuzzGame game = new FizzBuzzGame();

        for (int j = 0; j < numberOfPlayers; j++){
            game.addPlayer(new FizzBuzzPlayer());
        }

        game.startGame();
    }





}
