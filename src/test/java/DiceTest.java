import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class DiceTest {


    @Test
    public void testTossAndSumValue() {
        int numberOfDies = 2;
        Dice dice = new Dice(numberOfDies);
        dice.tossAndSum();
        boolean expected;

        if (dice.tossAndSum() > 1 && dice.tossAndSum() <= 12) {
            expected = true;
        } else {
            expected = false;
        }

        Assert.assertEquals(expected, true);
    }


}