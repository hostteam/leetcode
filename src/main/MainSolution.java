package main;

public class MainSolution {

    public static void main(String args[]) {
        Solution object = new Solution();
        int result = object.canCompleteCircuit(new int[] {2, 3, 4}, new int[] {3,4,3});
        System.out.println(result);
    }
}
