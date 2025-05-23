package programs;

import java.util.*;

public class LengthOfLongestPalindrome {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(lengthOfLongestPalindrome(s));
    }
    public static String lengthOfLongestPalindrome(String s){
        int left = 0;
        int right = 0;
        int mid = 0;
        int mid1 = 0;
        int start = 0;
        int end = s.length();
        String subString = "";
        if(s.length() % 2 != 0){
            mid = start+end/2;
            left = mid -1 ;
            right = mid +1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                subString = s.substring(left,right+1);
                left--;
                right++;
            }
        }else{
            mid = start+end/2;
            mid1 = (start+end/2)-1;
            left = mid1 - 1;
            right = mid + 1;
            while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                subString = s.substring(left,right+1);
                left--;
                right++;
            }
        }
        return subString;
    }
}



