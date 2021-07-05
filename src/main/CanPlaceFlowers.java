package main;
/*
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's,
where 0 means empty and 1 means not empty, and an integer n,
return if n new flowers can be planted in the
flowerbed without violating the no-adjacent-flowers rule.
 */

//O(n) solution, use a greedy algorithm
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        //We will plant a flower as soon as we find space with three nill
        //in the beginning we are adding 1 as we can plant a flower right at the border
        int spaceBtw = 1;

        for (int i = 0; i <= flowerbed.length; i++) {
            if (i == flowerbed.length) spaceBtw++;
            else if (flowerbed[i] == 0) spaceBtw++;
            else spaceBtw = 0;

            if (spaceBtw == 3) {
                n--;
                //taking one step back, to search for new place to plant
                i--;
                spaceBtw = 0;
            }
            if (n == 0) return true;
        }
        return false;
    }
}
