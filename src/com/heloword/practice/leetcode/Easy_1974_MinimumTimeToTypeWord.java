package com.heloword.practice.leetcode;

public class Easy_1974_MinimumTimeToTypeWord {
  public static void main(String[] args) {

    System.out.println(minTimeToType("abc"));
    System.out.println(minTimeToType("bza"));
//    System.out.println(minTimeToType("b"));
//    System.out.println(minTimeToType("e"));

//    System.out.println(getShortestPath('a', 'z'));
//    System.out.println(getShortestPath('a', 'b'));
//    System.out.println(getShortestPath('c', 'z'));
//    System.out.println(getShortestPath('c', 'a'));
  }

  public static int minTimeToType(String word) {

    // (int) a = 97
    // z = 122

    if (word.isEmpty()) {
      return 0;
    }

    if (word.length() == 1 && word.charAt(0) == 'a') {
      return 1;
    }

    if (word.length() == 1) {
      return getShortestPath('a', word.charAt(0)) + 1;
    }

    char[] chars = word.toCharArray();

    int counter = 0;

    // length >= 2

    for (int i = 0; i < chars.length; i++) {
      if (i == 0) {
        counter += getShortestPath('a', chars[i]) + 1;
      } else {
        counter += getShortestPath(chars[i - 1], chars[i]) + 1;
      }
      System.out.println(String.format("i = %s, counter = %s, chars[i] = %s", i, counter, chars[i]));
    }

    return counter;
  }

  public static int getShortestPath(char a, char b) {
    int distance = Math.abs((int) a - (int) b);
    return Math.min(26 - distance, distance);
  }

}
