package com.heloword.practice.leetcode;

public class Easy_1417_ReformatTheString {

	public static void main(String[] args) {
//		Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).
//		You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.
//		Return the reformatted string or return an empty string if it is impossible to reformat the string.
//		 
//		Example 1:
//
//		Input: s = "a0b1c2"
//		Output: "0a1b2c"
//		Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
		
		System.out.println(reformat("a0b1c2"));
	}
	
	
    public static String reformat(String s) {
        
        if(s.length() == 1) return s;
        
        int charCount = 0;
        int numCount = 0;
        char[] strCharArray = s.toCharArray();
        char[] charArray = new char[s.length()];
        char[] numArray = new char[s.length()];
        int index = 0;
        for(int i = 0, j = 0, k = 0; i < s.length(); i++) {
            if( Character.isLetter(strCharArray[i]) ){
                charArray[j++] = strCharArray[i];
                charCount++;
            } else if ( Character.isDigit(strCharArray[i]) ) {
                numArray[k++] = strCharArray[i];
                numCount++;
            }
        }
               
        if(charCount == 0 || numCount == 0 || Math.abs(charCount - numCount) > 1 ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        boolean isCharGoNext = false;
        for(int i = 0, j = 0, k = 0; i < s.length(); i++) {
            
            if( i == 0 ) {
                if(charCount > numCount) {
                    sb.append(charArray[j++]);
                } else {
                    sb.append(numArray[k++]);
                    isCharGoNext = true;
                }
                continue;
            }
            
            if(isCharGoNext) {
                // if(j < charArray.length)
                sb.append(charArray[j++]);
            } else {
                // if(k < numArray.length)
                sb.append(numArray[k++]);
            }
            isCharGoNext = !isCharGoNext;
        }
        return sb.toString();
    }
}
