package de.qacrobat.fizzbuzz;

public class FizzBuzzPlayer {

    private static int count = 0;
    private static final String BUZZ_WORD = "Buzz";
    private static final String FIZZ_WORD = "Fizz";
    private static final int BUZZ_NUMBER = 5;
    private static final int FIZZ_NUMBER = 3;
    private final int number;

    public FizzBuzzPlayer(){
        super();
        FizzBuzzPlayer.count = count + 1;
        this.number = count;
    }

    public void sayNextWord(int i) {
        System.out.print("Player " + number + " says: " + determineWord(i));
    }

    public String determineWord(int number) {
        String result = String.valueOf(number);
        if (number % FIZZ_NUMBER == 0 && number % BUZZ_NUMBER == 0) {
            result = FIZZ_WORD + BUZZ_WORD;
        } else if (number % FIZZ_NUMBER == 0) {
            result = FIZZ_WORD;
        } else if (number % BUZZ_NUMBER == 0) {
            result = BUZZ_WORD;
        }
        return result;
    }
}
