import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSolution {

    @Test
    /**
     * Test 1: nums = [2, 7, 11, 15], target = 9 Solution: [0,1]
     * Test 2: nums = [3, 7, 1, 10], target = 8 Solution: [1,2]
     * Test 3: nums = [2, 2], target = 4 Solution: [0,1]
     */
    public void testScenarios() {
        int testNums[][] = {
                {2,7,11,15},
                {3,7,1,10},
                {2,2},
                {3,6,9}
        };
        int targets[]= {
                9,
                8,
                4,
                9
        };
        int expectedSolutions[][] = {
                {0,1},
                {1,2},
                {0,1},
                {0,1}
        };

        for (int i = 0; i < testNums.length; i++) {
            final int nums[] = testNums[i];
            final int target = targets[i];
            final int expectedSolution[] = expectedSolutions[i];

            final int actualSolution[] = new Solution().twoSum(nums, target);
            assertArrayEquals(expectedSolution, actualSolution);
        }

    }

}
