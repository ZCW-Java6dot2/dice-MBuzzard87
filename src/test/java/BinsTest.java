import org.junit.Assert;
import org.junit.Test;

public class BinsTest {



    @Test
    public void testBinArrSize() {
        int numDie = 2;
        int numToss = 10;
        Bins bins = new Bins(numDie, numToss);

        Integer expected = 11;
        Integer actual = bins.getIncbinArr().length;

        Assert.assertEquals(expected,actual);
    }


}
