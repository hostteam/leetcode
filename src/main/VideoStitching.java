package main;
/*
You are given a series of video clips from a sporting event that lasted time seconds.
These video clips can be overlapping with each other and have varying lengths.

Each video clip is described by an array clips where clips[i] = [starti, endi]
indicates that the ith clip started at starti and ended at endi.

We can cut these clips into segments freely.

For example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
Return the minimum number of clips needed so that we can cut the clips into
segments that cover the entire sporting event [0, time]. If the task is impossible, return -1.
 */
import java.util.Arrays;

public class VideoStitching {
    public int videoStitching(int[][] clips, int T) {
        if (T <= 0) return 0;

        //an array there are an index is a starting time and
        //array[index] is a maximum length of a video starting at index time
        int[] timeLine = new int[T + 1];
        Arrays.fill(timeLine, -1);
        for (int[] clipLength : clips) {
            int startTime = clipLength[0];
            int endTime = clipLength[1];

            if (startTime > T) continue;
            //chosen the longest video for startTime
            timeLine[startTime] = Math.max(timeLine[startTime], Math.min(endTime, T));
        }

        int countClips = 1;
        if (timeLine[0] >= T) return countClips;
        else if (timeLine[0] == -1) return -1;

        int whereWeAre = 0;
        int nextClipTill = timeLine[0];
        for (int i = 0; i < timeLine.length; i++) {
            //if between current video and next is gap, return -1
            if (i > nextClipTill) return -1;

            whereWeAre = Math.max(whereWeAre, timeLine[i]);

            if (whereWeAre >= T) {
                countClips++;
                return countClips;
            }
            //taking the next suitable video after finishing previous
            if (i == nextClipTill) {
                nextClipTill = whereWeAre;
                countClips++;
            }

        }

        return -1;
    }
}