package com.algo.dayofProg;

public class PageCount {
    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
        int count = 0, pageToTurn = 0, backCount = 0;
        int maxPageTurn = n / 2;
        count = p / 2;
        backCount = maxPageTurn - p / 2;

        if (backCount < count) {
            return backCount;
        } else {
            return count;
        }

    }
}
