package programs;

import java.util.HashMap;

public class CalculateFraction {
    public static String calculateFraction(int numerator,int denominator){
        // int numerator = 50;
        // int denominator = 22;
        // System.out.println("Result is: "+calculateFraction(numerator,denominator)); // 2.(27)
        if(numerator == 0){
            return "0";
        }
        String res = (numerator < 0) ^ (denominator < 0) ? "-" : "";
        res += Integer.toString(numerator/denominator);
        int rem = numerator%denominator;
        if(rem == 0){
            return res;
        }
        res += ".";

        HashMap<Integer,Integer> map = new HashMap<>();
        while(rem > 0){
            if(map.containsKey(rem)) {
                res = res.substring(0, map.get(rem))+"("+res.substring(map.get(rem))+")";
                break;
            }
            map.put(rem,res.length());
            rem *= 10;
            res += Integer.toString(rem/denominator);
            rem = rem%denominator;
        }
        System.out.println(res);
        return res;
    }

}
