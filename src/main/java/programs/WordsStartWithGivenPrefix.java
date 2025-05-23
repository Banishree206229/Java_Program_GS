package programs;

import java.util.Arrays;
import java.util.List;

public class WordsStartWithGivenPrefix {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        List<String> st = Arrays.stream(arr).filter(s -> s.startsWith(prefix)).toList();
        System.out.println(st);
    }
}

