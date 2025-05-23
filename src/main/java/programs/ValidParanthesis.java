package programs;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
       String s = "({})";
       System.out.println(checkParanthesis(s));
    }
    public static boolean checkParanthesis(String paranthesis){
        Stack<Character> stack = new Stack<>();
        char[] ch = paranthesis.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
                stack.push(ch[i]);
            }
            else if(!stack.isEmpty()){
                if((stack.peek() == '(' && ch[i] == ')') || (stack.peek() == '{' && ch[i] == '}') || (stack.peek() == '[' && ch[i] == ']')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
//=====================================================================================================================================================
/*
public static void main(String[] args) {
        String st = "({[]})";
       System.out.println(checkValidParanthesis(st));
    }
    public static boolean checkValidParanthesis(String st){
        int roundCount = 0;
        int curlyCount = 0;
        int squareCount = 0;
        for(char c:st.toCharArray()){
            if(c == '('){
                roundCount++;
            }else if(c == ')'){
                roundCount--;
                if(roundCount < 0){
                    return false;
                }
            }else if (c == '{') {
                curlyCount++;
            }else if(c == '}'){
                curlyCount--;
                if(curlyCount<0){
                    return false;
                }
            }else if(c == '['){
                squareCount++;
            }else if(c == ']'){
                squareCount--;
                if(squareCount<0){
                    return false;
                }
            }
        }
        return roundCount == 0 && curlyCount == 0 && squareCount == 0;
    }

*/
