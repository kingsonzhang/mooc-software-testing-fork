package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    private GettingStarted tester;
    @BeforeEach
    public void setUp(){
        tester = new GettingStarted();
    }

    @Test
    public void addFiveTo20() {
        int result = tester.addFive(20);
        Assertions.assertEquals(25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = tester.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = tester.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
