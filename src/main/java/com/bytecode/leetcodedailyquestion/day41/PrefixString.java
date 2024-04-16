/*
Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.
 */
package com.bytecode.leetcodedailyquestion.day41;

public class PrefixString {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res = new StringBuilder ("");
        for (String word : words) {
            res.append (word);
            if (s.equals (res.toString()))
                return true;
            if (s.indexOf (res.toString()) == -1)
                return false;
        }
        return false;
    }
}
