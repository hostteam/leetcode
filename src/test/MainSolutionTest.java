package test;

import main.CountMatches;
import main.Solution;
import main.VideoStitching;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainSolutionTest {
    @Test
    public void canCompleteCircuitTest() {
        Solution object = new Solution();
        assertEquals(-1 , object.canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3,4,3}));
        assertEquals(3 , object.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
    }

    @Test
    public void videoStitchingTest() {
        VideoStitching vs = new VideoStitching();
        assertEquals(3, vs.videoStitching(new int[][] {{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}}, 10));
        assertEquals(-1, vs.videoStitching(new int[][] {{0,1},{1,2}}, 5));
        assertEquals(3, vs.videoStitching(new int[][] {{0,1},{6,8},{0,2},{5,6},{0,4},{0,3},{6,7},{1,3},{4,7},{1,4},{2,5},{2,6},{3,4},{4,5},{5,7},{6,9}}, 9));
        assertEquals(2, vs.videoStitching(new int[][] {{0,4},{2,8}}, 5));
    }

    @Test
    public void countMatchesTest() {
        CountMatches cm = new CountMatches();
        List<List<String>> params = new ArrayList<>();
        params.add(Arrays.asList(new String[] {"phone","blue","pixel"}));
        params.add(Arrays.asList(new String[] {"computer","silver","lenovo"}));
        params.add(Arrays.asList(new String[] {"phone","gold","iphone"}));
        assertEquals(1, cm.countMatches(params, "color", "silver"));
        params.clear();
        params.add(Arrays.asList(new String[] {"phone","blue","pixel"}));
        params.add(Arrays.asList(new String[] {"computer","silver","phone"}));
        params.add(Arrays.asList(new String[] {"phone","gold","iphone"}));
        assertEquals(2, cm.countMatches(params, "type", "phone"));
    }

}
