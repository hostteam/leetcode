package test;

import main.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainSolutionTest {
    @Test
    public void canCompleteCircuitTest() {
        Solution object = new Solution();
        assertEquals(-1 , object.canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3,4,3}));
        assertEquals(3 , object.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));

    }

}
