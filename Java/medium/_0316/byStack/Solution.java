package medium._0316.byStack;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeDuplicateLetters(String s) {
        int length = s.length();
        char [] strArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<Character>();
        int [] last = new int[105];
        for(int i = 0; i < length; i++){
            last[strArray[i] - 'a'] = i;
        }
        int [] vis = new int[105];
        for(int i = 0; i < length; i++){
            char ch = strArray[i];
            if(vis[ch - 'a'] == 1) continue;
            while(!stack.isEmpty() && stack.getLast() > ch && last[stack.getLast() - 'a'] > i){
                Character top = stack.removeLast();
                vis[top - 'a'] = 0;
            }
            stack.addLast(ch);
            vis[ch - 'a'] = 1;
        }
        StringBuffer strAns = new StringBuffer();
        for(char ch : stack) strAns.append(ch);
        return strAns.toString();
    }
}