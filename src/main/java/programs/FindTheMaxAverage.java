package programs;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheMaxAverage {
    public static void main(String[] args) {
        String[][] input = {
                {"Alice", "90"}, {"Bob", "85"}, {"Alice", "95"},
                {"Charlie", "78"}, {"Bob", "80"}, {"Charlie", "82"}};
        // Alice: 185/2 = 92, Bob: 165/2 = 82, Charlie: 160/2 = 80
        System.out.println(findTheMaxAverage(input));
    }
    public static String findTheMaxAverage(String[][] input){
        Map<String, int[]> map = new HashMap<>();
        for(String[] st:input){
            String name = st[0];
            int mark = Integer.valueOf(st[1]);
            map.put(name, new int[2]);
            map.get(name)[0] += mark;
            map.get(name)[1]++;
        }

        int studentAvgMarks  = Integer.MIN_VALUE;
        String StudentName =  "";
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,int[]> i:map.entrySet()){
            int totalMark = i.getValue()[0];
            int totalSubject = i.getValue()[1];
            int avg =  totalMark/totalSubject;
            if(avg>studentAvgMarks ){
                studentAvgMarks  = avg;
                StudentName = i.getKey();
            }
        }
        sb.append(StudentName);
        return String.valueOf(sb);
    }
}