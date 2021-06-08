package main;
//brute-force solution O(n^2)
class Solution {
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
