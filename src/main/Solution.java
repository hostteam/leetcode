/*
There are n gas stations along a circular route,
where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it
costs cost[i] of gas to travel from the ith station
to its next (i + 1)th station.
You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost,
return the starting gas station's index
if you can travel around the circuit once in the clockwise direction,
otherwise return -1. If there exists a solution,
it is guaranteed to be unique
*/

package main;
//brute-force solution O(n^2)
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] restOFGas = new int[gas.length];

        for (int i = 0; i < gas.length; i++) {
            //restOFGas[i] shows the rest of gas after reaching i + 1 gas station
            restOFGas[i] = gas[i] - cost[i];
        }

        //checking the existent circular way from gas[result] station while gasInTank >= 0
        int result = 0;
        while (result < gas.length) {
            int gasInTank = restOFGas[result];
            int steps = result == gas.length - 1 ? 0 : result + 1;
            int tmp = 1;
            while (tmp < gas.length & gasInTank >=0) {
                gasInTank += restOFGas[steps];
                steps = steps == gas.length - 1 ? 0 : steps + 1;
                tmp++;
            }
            if (gasInTank >= 0) return result;
            result++;
        }
        return -1;
    }
}
