package programs;

import java.util.*;
import java.util.stream.Collectors;

public class EachCharacterWithCount {
    public static void main(String[] args) {
        String s = "aabbb";
        System.out.println(eachCharacterWithCount(s));
    }

    public static String eachCharacterWithCount(String s) {

        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Long> mapNew : map.entrySet()) {
            sb.append(mapNew.getKey());
            sb.append(mapNew.getValue());
        }
        return String.valueOf(sb);
      /*Another approach
        if(s == null || s.isEmpty()){
            return "";
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);//for last character
        return String.valueOf(sb);*/
    }
}



