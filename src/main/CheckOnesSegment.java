package main;

public class CheckOnesSegment {
    public boolean checkOnesSegment(String s) {
        char[] newLine = s.toCharArray();
        int i = 0;
        int j = newLine.length - 1;
        while (newLine[i] != '1' || newLine[j] != '1') {
            if (i > j) return false;
            if (newLine[i] != '1') i++;
            if (newLine[j] != '1') j--;
        }
        if (j - i <= 1) return true;

        for (int ind = i+1; ind < j; ind++) {
            if (newLine[ind] == '0') return false;
        }
        return true;
    }
}