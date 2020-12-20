package medium._0017.by_DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if(digits.length() == 0){
            return ans;
        }
        Map<Character,String> map = new HashMap<Character, String>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        getAnsByDfs(ans,map,digits,new StringBuffer(),0);
        return ans;
    }
    void getAnsByDfs(List<String> ans,Map<Character,String> map,String digits,StringBuffer tmp,int index){
        if(index == digits.length()){
            ans.add(tmp.toString());
        }else{
            char ch = digits.charAt(index);
            String str = map.get(ch);
            for(int i = 0; i < str.length(); i++){
                tmp.append(str.charAt(i));
                getAnsByDfs(ans,map,digits,tmp,index+1);
                tmp.deleteCharAt(index);
            }
        }
    }
}