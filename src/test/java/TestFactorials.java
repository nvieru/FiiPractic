import org.junit.Assert;
import org.junit.Test;

public class TestFactorials {

    @Test
    public void given_3_then_6(){
        Application application = new Application();

        Assert.assertEquals(6, application.computeFactorial(3));
    }

    @Test
    public void given_12_then_479001600(){
        Application application = new Application();

        Assert.assertEquals(479001600, application.computeFactorial(12));
    }
}
