package programs;

import org.springframework.web.servlet.tags.EscapeBodyTag;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacter{
public static void main(String[] args) {
        String str = "abbacd";
        String c = Arrays.stream(str.split("")).collect(Collectors.groupingBy(i -> i,Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()==1).map(ch -> ch.getKey()).findFirst().get();
        System.out.println(c);
    }
//===================================================================
public static Character findNonRepeatedCharacter(String str){
        char[] chArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c:chArray){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> mapNew:map.entrySet()){
            if(mapNew.getValue() == 1){
                return mapNew.getKey();
            }
        }
        return null;
    }
    }