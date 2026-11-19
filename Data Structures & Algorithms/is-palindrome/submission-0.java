class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for(int k = 0; k < s.length(); k++){
            if(Character.isLetterOrDigit(s.charAt(k))) {
                str.append(s.charAt(k));
            } 
        }

        int i = 0; 
        int j = str.length()-1;

        while(i < j){
            
            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))){
                i++;
                j--;
            }
            else {
            return false;
            }
        }

        return true;
        
    }

}

