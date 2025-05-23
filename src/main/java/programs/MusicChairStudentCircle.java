package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//int[] arr = {1,2,3,4};
  //int k = 2;
  //System.out.println(musicChairStudentCircle(arr,k));//1
 public class MusicChairStudentCircle {
     public static int musicChairStudentCircle(int[] arr, int k) { //26 no.
         List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
         int index = 0;
         while (li.size() > 1) {
             index = (index + k - 1) % li.size();
             li.remove(index);
         }
         return li.get(0);
     }
 }