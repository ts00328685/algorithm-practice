package com.heloword.practice.leetcode;

import java.util.Arrays;

public class Medium_5_LongestPalindromicSubstring {

  public static void main(String[] args) {
//    Input: s = "babad"
//    Output: "bab"
//    Explanation: "aba" is also a valid answer.
// https://leetcode.com/problems/longest-palindromic-substring/

//    System.out.println(longestPalindrome("babadccdcc"));
//    System.out.println(longestPalindrome("ccc"));
//    System.out.println(longestPalindrome("cbbd"));
    System.out.println(longestPalindrome("bb"));
  }

  public static String longestPalindrome(String s) {
//    return brutal(s);
    return brutalCombinedEvenAndOdd(s);
  }

  public static String brutal(String s) {

    // consider every character as the center and check from center to the left and right end to see if we get a palindrom
    char[] chars = s.toCharArray();

    String result = "";

    for (int i = 0; i < chars.length; i++) {

      int left = i, right = i;
      int tempLeft = i, tempRight = i;
      String temp = "";
      while (left >= 0 && right < chars.length) {

        if (chars[left] == chars[right]) {
          tempLeft = left;
          tempRight = right;
        } else {
          break;
        }

        left--;
        right++;

      }
      temp = String.valueOf(Arrays.copyOfRange(chars, tempLeft, tempRight + 1));

      String tempEven = "";
      left = i;
      right = i + 1;
      while (left >= 0 && right < chars.length) {
        if (chars[left] == chars[right]) {
          tempLeft = left;
          tempRight = right;
        } else {
          break;
        }

        left--;
        right++;

      }

      tempEven = String.valueOf(Arrays.copyOfRange(chars, tempLeft, tempRight + 1));

      temp = temp.length() > tempEven.length() ? temp : tempEven;

      if (temp.length() > result.length()) {
        result = temp.toString();
      }

    }
    return result;
  }

  public static String brutalCombinedEvenAndOdd(String s) {

    // consider every character as the center and check from center to the left and right end to see if we get a palindrom
    char[] chars = s.toCharArray();

    String result = "";

    for (int i = 0; i < chars.length; i++) {

      int left = i, right = i, leftEven = i, rightEven = i + 1;
      int tempLeft = i, tempRight = i, tempLeftEven = i, tempRightEven = i;
      String temp = "";
      while ((left >= 0 || leftEven >= 0) && (right < chars.length || rightEven < chars.length)) {
        if (left >= 0 && right < chars.length && chars[left] == chars[right]) {
          tempLeft = left;
          tempRight = right;
          left--;
          right++;
        } else if (leftEven >= 0 && rightEven < chars.length && chars[leftEven] == chars[rightEven]) {
          tempLeftEven = leftEven;
          tempRightEven = rightEven;
          leftEven--;
          rightEven++;

        } else {
          break;
        }

      }
      boolean isEvenLonger = (tempRightEven - tempLeftEven) > (tempRight - tempLeft);

      temp = isEvenLonger ? String.valueOf(Arrays.copyOfRange(chars, tempLeftEven, tempRightEven + 1)) : String.valueOf(Arrays.copyOfRange(chars, tempLeft, tempRight + 1));

      if (temp.length() > result.length()) {
        result = temp;
      }



    }
    return result;
  }

}
