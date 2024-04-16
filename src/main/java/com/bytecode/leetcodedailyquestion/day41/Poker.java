/*
You are given an integer array ranks and a character array suits. You have 5 cards where the ith card has a rank of ranks[i] and a suit of suits[i].

The following are the types of poker hands you can make from best to worst:

"Flush": Five cards of the same suit.
"Three of a Kind": Three cards of the same rank.
"Pair": Two cards of the same rank.
"High Card": Any single card.
Return a string representing the best type of poker hand you can make with the given cards.

Note that the return values are case-sensitive.
 */
package com.bytecode.leetcodedailyquestion.day41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Poker {
    public String bestHand(int[] ranks, char[] suits) {
        char suit = suits[0];
        boolean flag = true;
        for(char c : suits)
        {
            if(suit!=c)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            return "Flush";
        Map<Integer, Integer> rank = new HashMap<>();
        for(int  i : ranks)
        {
            if(!rank.containsKey(i))
            {
                rank.put(i,1);
            }
            else
            {
                int count = rank.get(i);
                rank.put(i,++count);
            }
        }
        int count = 0 ;
        for(int i : rank.keySet())
        {
            if(rank.get(i)>count)
                count = rank.get(i);
        }

        if(count==2)
            return "Pair";
        else if(count==1)
            return "High Card";
        else
            return "Three of a Kind";
    }
}
