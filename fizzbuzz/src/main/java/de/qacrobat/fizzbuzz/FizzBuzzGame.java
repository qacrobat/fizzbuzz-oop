package de.qacrobat.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzGame {
    private static final int LAST_NUMBER = 100;
    private final int lastNumber;
    private List<FizzBuzzPlayer> players = new LinkedList<>();

    public FizzBuzzGame() {
        this(LAST_NUMBER);
    }

    public FizzBuzzGame(int lastNumber) {
        super();
        this.lastNumber = lastNumber;
    }

    public void startGame() {
        for (int i = 1; i <= this.lastNumber; i++) {
            players.get(i % players.size()).sayNextWord(i);
            if (i < this.lastNumber) {
                System.out.print(", ");
            }
        }
    }

    public void addPlayer(FizzBuzzPlayer player) {
        players.add(player);
    }
}
