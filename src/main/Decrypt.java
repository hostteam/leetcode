package main;

/*
You have a bomb to defuse, and your time is running out! Your informer will provide you with a
circular array code of length of n and a key k.

To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.

If k > 0, replace the ith number with the sum of the next k numbers.
If k < 0, replace the ith number with the sum of the previous k numbers.
If k == 0, replace the ith number with 0.
As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].

Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 */

//O(n) solution
public class Decrypt {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0) return res;

        int sum = 0;
        int steps = 0;
        for (int indK = 0; indK < Math.abs(k); indK++) {
            if (k > 0) {
                steps++;
                if (steps > n - 1) steps %= n;
                sum += code[steps];

            } else {
                steps--;
                if (steps < 0) steps = n - Math.abs(steps) % n;
                sum += code[steps];
            }
        }

        for (int i = 0; i < n; i++) {
            res[i] = sum;
            int left = i;
            int right = i + k;
            if (k > 0) {
                left += 1;
                right += 1;
                if (left > n - 1) left = 0;
                if (right > n - 1) {
                    right = right % n;
                }
                sum = sum - code[left] + code[right];
            } else {
                if (right < 0) right = n - Math.abs(right) % n;
                sum = sum + code[left] - code[right];
            }
        }

        return res;
    }
}
