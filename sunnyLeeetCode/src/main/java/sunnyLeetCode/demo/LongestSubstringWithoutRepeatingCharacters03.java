package sunnyLeetCode.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters03 {
    public static int lengthOfLongestSubstring(String s) {
        int currentStartIndex = 0;
        int currentEndIndex = 1;
        String currentString;
        int longestSubstringLength = 1;
        if (s.length() == 0) return 0;
        while (currentEndIndex < s.length()) {
            String compareStr = s.substring(currentEndIndex, currentEndIndex + 1);
            currentString = s.substring(currentStartIndex, currentEndIndex);
            if (currentString.contains(compareStr)){
                currentStartIndex++;
                if (currentString.length() == 1){
                    currentEndIndex++;
                }
                if (currentString.length() > longestSubstringLength){
                    longestSubstringLength = currentString.length();
                }
            } else {
                if ((currentString.length() + 1) > longestSubstringLength){
                    longestSubstringLength = currentString.length() + 1;
                }
                currentEndIndex++;
            }
        }
        return longestSubstringLength;
    }


    public static void main(String[] args) {
        System.out.println("abcabcbb:3:" + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("pwwkew:3:" + lengthOfLongestSubstring("pwwkew"));
        System.out.println("bbbbb:1:" + lengthOfLongestSubstring("bbbbb"));
        System.out.println("dvdf:3: " + lengthOfLongestSubstring("dvdf"));
        System.out.println(":0:" + lengthOfLongestSubstring(""));
        System.out.println(" :1:" + lengthOfLongestSubstring(" "));

        System.out.println("au:2:" + lengthOfLongestSubstring("au"));
    }
}

