package main;

import java.util.Arrays;

public class PivotIndex {
    public String generateTheString(int n) {
        char[] stringAsArray= new char[n];
        Arrays.fill(stringAsArray, 'b');
        if (n % 2 == 0) stringAsArray[0] = 'a';
        String str = new String(stringAsArray);
        return str;
    }
}
