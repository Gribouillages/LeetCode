package easy._0389;

class Solution {
    public char findTheDifference(String s, String t) {
        int [] vis = new int[205];
        for(int i = 0; i < s.length(); i++){
            vis[s.charAt(i) - '0'] ++;
        }
        for(int i = 0; i < t.length(); i++){
            if(-- vis[t.charAt(i) - '0'] < 0) return t.charAt(i);
        }
        return ' ';
    }
}