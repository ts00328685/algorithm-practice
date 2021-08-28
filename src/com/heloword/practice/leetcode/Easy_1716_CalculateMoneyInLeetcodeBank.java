package com.heloword.practice.leetcode;

public class Easy_1716_CalculateMoneyInLeetcodeBank {


    public static void main(String[] args) {

// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday,
// he will put in $1 more than the day before. On every subsequent Monday,
// he will put in $1 more than the previous Monday.
// Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.

//        Input: n = 10
//        Output: 37
//        Explanation: After the 10th day,
//        the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37.
//        Notice that on the 2nd Monday, Hercy only puts in $2.


        // 1. find how many weeks there are
        // 2. find the remaining days that do not last for a week
        // 3. the total of every week will be (n + n+1 ... n+6)

        // n(n+1) / 2

//        Input: n = 10
//        Output: 37

//        Input: n = 20
//        Output: 96

        int input = 4;

        int weeks = input / 7;
        int remainingDays = input % 7;

        int output = 0;

        for (int i = 0; i < weeks; i++) {

            for (int j = i + 1; j <= 7 + i; j++) {
                output += j;
                System.out.println("output += " + j);
            }
        }
        System.out.println("output for all weeks: " + output);

        for (int i = 1, j = weeks + 1; i <= remainingDays; i++, j++) {
            output+=j;
        }
        System.out.println("output for all: " + output);

    }
}
