package main;

public class MainSolution {

    public static void main(String args[]) {
        Solution object = new Solution();
        int result = object.canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3,4,3});
        System.out.println(result);

        VideoStitching object2 = new VideoStitching();
        result = object2.videoStitching(new int[][] {{0,2},{4,6},{8,10},{1,9},{1,5},{5,9}}, 10);

        System.out.println(result + " videos we need to cover 10 mins");
    }
}
