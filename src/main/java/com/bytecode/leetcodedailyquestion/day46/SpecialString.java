/*
You are given an array of strings of the same length words.

In one move, you can swap any two even indexed characters or any two odd indexed characters of a string words[i].

Two strings words[i] and words[j] are special-equivalent if after any number of moves, words[i] == words[j].

For example, words[i] = "zzxy" and words[j] = "xyzz" are special-equivalent because we may make the moves "zzxy" -> "xzzy" -> "xyzz".
A group of special-equivalent strings from words is a non-empty subset of words such that:

Every pair of strings in the group are special equivalent, and
The group is the largest size possible (i.e., there is not a string words[i] not in the group such that words[i] is special-equivalent to every string in the group).
Return the number of groups of special-equivalent strings from words.
 */
package com.bytecode.leetcodedailyquestion.day46;

import java.util.Arrays;
import java.util.HashSet;

public class SpecialString {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> h=new HashSet<>();
        for(String str:words){
            int[] odd=new int[26];
            int [] even=new int[26];
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    even[str.charAt(i)-'a']++;
                }else{
                    odd[str.charAt(i)-'a']++;
                }}
            String key= Arrays.toString(odd)+Arrays.toString(even);
            h.add(key);

        }
        return h.size();
    }
}
