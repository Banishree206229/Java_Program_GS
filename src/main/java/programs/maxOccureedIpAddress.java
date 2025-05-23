package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maxOccureedIpAddress {
    public static String maxOccureedIpAddress(String[] str) {
        Map<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String finalIpAddress = "";
        for (String st : str) {
            String[] ip = st.split(" ", 2);
            String ipAddress = ip[0];
            if (map.containsKey(ipAddress)) {
                map.put(ipAddress, map.get(ipAddress) + 1);
            } else {
                map.put(ipAddress, 1);
            }
            int currentIpCount = map.get(ipAddress);
            if (currentIpCount > max) {
                max = currentIpCount;
                finalIpAddress = ipAddress;
            }
        }
        return finalIpAddress;
    }

    //(OR)
   // Map.Entry<String, Long> map1 = Arrays.stream(str).map(s -> s.split(" ", 2)).collect(Collectors.groupingBy(st -> st[0], Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        //System.out.println(map1.getKey());
}