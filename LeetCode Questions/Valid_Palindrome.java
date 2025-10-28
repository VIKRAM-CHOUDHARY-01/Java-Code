//My Approach : 
class Solution {
    public boolean isPalindrome(String s) {
        
        Boolean pali = false;
        s = s.toLowerCase();
        String ans="";
        for(int i  = 0; i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+=s.charAt(i);
            }
        }
        if(ans==""){
            return true;
        }
      
        int left = 0;
        int right = ans.length()-1;

        while(left<=right){
            
                if(ans.charAt(left) == ans.charAt(right)){
                    pali = true;
                }else{
                    pali = false;
                    break;
                }
            
            left++;
            right--;
        }
        return pali;
    }
}


//Appraoch 2

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            }
        }
        
        String filtered = ans.toString(); 
        
       
        if (filtered.isEmpty()) {
            return true;
        }
        
        
        int left = 0, right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

    