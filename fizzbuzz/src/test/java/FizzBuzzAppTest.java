import de.qacrobat.fizzbuzz.FizzBuzzApp;
import de.qacrobat.fizzbuzz.FizzBuzzPlayer;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzAppTest {
    private FizzBuzzPlayer playerTestee;


    @Before
    public void setup() {
        playerTestee = new FizzBuzzPlayer();
    }

    @Test
    public void shouldSayFizzForMultipleOfThree() {
        String result = playerTestee.determineWord(3);

        Assert.assertThat(result, CoreMatchers.is("Fizz"));

        result = playerTestee.determineWord(27);

        Assert.assertThat(result, CoreMatchers.is("Fizz"));
    }

}
