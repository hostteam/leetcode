package main;
/*
You are given an array items, where each items[i] = [typei, colori, namei]
describes the type, color, and name of the ith item.
You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
 */
import java.util.List;
//O(n) solution, going through the array and counting the matches int the column
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleKeyInt = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        return (int) items.stream().filter(a -> a.get(ruleKeyInt).equals(ruleValue)).count();
    }
}
