/*Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".    */

    class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        for(int i = 0;i<strs[0].length();i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                ans+=strs[0].charAt(i);
            }
            else{
              
                break;
            }
        }
          return ans;
    }
}