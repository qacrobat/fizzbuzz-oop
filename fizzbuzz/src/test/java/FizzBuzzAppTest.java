import de.qacrobat.fizzbuzz.FizzBuzzApp;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzAppTest {
    private FizzBuzzApp testee;

    @Before
    public void setup() {
        testee = new FizzBuzzApp();
    }

    @Test
    public void shouldSayFizzForMultipleOfThree() {
        String result = testee.determineWord(3);

        Assert.assertThat(result, CoreMatchers.is("Fizz"));

        result = testee.determineWord(27);

        Assert.assertThat(result, CoreMatchers.is("Fizz"));
    }

}
