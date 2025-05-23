package programs;

import java.util.*;
import java.util.stream.Collectors;

public class SearchString {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(searchString(dict,toSearch));
    }
        public static int searchString(String[] dict,String toSearch){
            int maxLength = 0;
            int currentLength = 0;
            String lowerToSearch =  toSearch.toLowerCase();
            for(String st:dict){
                if(st.toLowerCase().contains(lowerToSearch)){
                    currentLength = st.length();
                    if(currentLength > maxLength){
                        maxLength = currentLength;
                    }
                }
            }
            return maxLength;
    }
}



