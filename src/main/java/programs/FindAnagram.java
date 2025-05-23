package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagram {
    public static void main(String[] args) {
    String[] dict = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
    String input = "abcd";
    List<String> li = new ArrayList<>();
        for(String st:dict){
        if(findAnagram(st,input)){
            li.add(st);
        }
    }
        System.out.println(li); //[abcd, bcad]
    // time complexity = O(n * m), space = O(n)
}

public static boolean findAnagram(String st, String input){
    Map<Character, Integer> map = new HashMap<>();
    if(st.length() != input.length()){
        return false;
    }

    for(char c:st.toCharArray()){
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        } else {
            map.put(c,1);
        }
    }

    for(char c:input.toCharArray()){
        if(!map.containsKey(c)){
            return false;
        }
        map.put(c, map.get(c)-1);
        if(map.get(c) == 0){
            map.remove(c);
        }
    }
    return map.isEmpty();
}
//(OR) -------------------------------------------
       /* if (str1.length() != str2.length()) {
        return false;
        }

// Convert strings to character arrays and sort them
char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

// Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);*/
}
