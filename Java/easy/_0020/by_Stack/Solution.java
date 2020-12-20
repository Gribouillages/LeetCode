package easy._0020.by_Stack;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>(){{
            put(')','(');
            put('}','{');
            put(']','[');
        }};
        for(Character ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(!stack.empty() && map.get(ch) == stack.peek()) stack.pop();
                else return false;
            }
        }
        return stack.empty();
    }
}