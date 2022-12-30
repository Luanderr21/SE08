import java.util.List;
import static java.lang.Math.max;

public class MaxSubSumOfSequence {

    public static int doCalculate(List<Integer> list) {
        int maxSubSum = 0;
        int tmpMax = 0;
        for (int i = 0; i < list.size(); i++) {
            tmpMax = max(tmpMax + list.get(i), list.get(i));
            maxSubSum = max(tmpMax, maxSubSum);
        }
        return maxSubSum;
    }
}
