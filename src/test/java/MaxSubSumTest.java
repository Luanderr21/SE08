import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubSumTest {
    @Test
    public void mainTest() {
        Assert.assertEquals(
                MaxSubSumOfSequence.doCalculate(new ArrayList<Integer>(Arrays.asList(1, -2, 3, 5, -1))), 8);
        Assert.assertEquals(
                MaxSubSumOfSequence.doCalculate(new ArrayList<Integer>(Arrays.asList(1, -2, 3, -8, 5, 1))), 6);
        Assert.assertEquals(
                MaxSubSumOfSequence.doCalculate(new ArrayList<Integer>(Arrays.asList(1, -2, 3, -2, 5, 1))), 7);
    }
}
