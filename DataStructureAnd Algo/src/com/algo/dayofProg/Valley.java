package com.algo.dayofProg;

import java.util.Stack;

public class Valley {

    public static void main(String[] args) {
        countingValleys(100, "UDUDDUUUDUDUDUUDUUDDDDDUDUDDDDUUDDUDDUUUUDUUDUDDDDUDUDUUUDDDUUUDUDDUUDDDUUDDUDDDUDUUDUUDUUDUDDDUUUUU");
    }

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        char[] steps = s.toCharArray();

        for (char c : s.toCharArray()) {
            if (c == 'U') {
                ++lvl;
            }
            if (c == 'D') {
                --lvl;
            }
            // if we just came UP to sea level
            if (lvl == 0 && c == 'U') {
                ++v;
            }
        }
        return v;
    }
}
