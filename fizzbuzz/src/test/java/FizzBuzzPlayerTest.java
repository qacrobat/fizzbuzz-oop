import de.qacrobat.fizzbuzz.FizzBuzzPlayer;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzPlayerTest {
    private FizzBuzzPlayer playerTestee;


    @Before
    public void setup() {
        playerTestee = new FizzBuzzPlayer();
    }

    @Test
    public void shouldSayFizzForMultipleOfThree() {
        String result = playerTestee.determineWord(3);

        Assertions.assertThat(result).isEqualTo("Fizz");

        result = playerTestee.determineWord(27);

        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void shouldSayBuzzForMultipleOfFive() {
        String result = playerTestee.determineWord(5);

        Assertions.assertThat(result).isEqualTo("Buzz");

        result = playerTestee.determineWord(50);

        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void shouldSayFizzBuzz() {
        String result = playerTestee.determineWord(15);

        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

}
