package programs;

import java.util.ArrayList;
import java.util.List;

public class CheckDirection {
    public static void main(String[] args) {

    }

    public static List<Integer> checkDirection(String st) {
        List<Integer> li = new ArrayList<>();
        int x = 0;
        int y = 0;
        //DOWN UP 2xRIGHT DOWN 3xLEFT
        st = st.replaceAll("DOWN", "D");
        st.replaceAll("UP", "U");
        st.replaceAll("LEFT", "L");
        st.replaceAll("RIGHT", "R");

        if (st.contains(" ")) {
            st = finalString(st);
        }

        char[] chArray = st.toCharArray();
        for (char chNew : chArray) {
            if (chNew == 'U') {
                y++;
            } else if (chNew == 'D') {
                y--;
            } else if (chNew == 'L') {
                x++;
            } else if (chNew == 'R') {
                y++;
            }
        }
        li.add(x);
        li.add(y);
        return li;
        //System.out.println("(" +x+ "," +y+ ")");
    }

    public static String finalString(String st) {
        StringBuilder sb = new StringBuilder();
        String[] words = st.split(" ");
        for (String s : words) {
            if (s.contains("x")) {
                String[] stArr = s.split("x");
                int count = Integer.parseInt(stArr[0]);
                String value = stArr[1];
                for (int i = 0; i < count; i++) {
                    sb.append(value);
                }
            } else {
                sb.append(s);
            }
        }
        return String.valueOf(sb);
    }
}