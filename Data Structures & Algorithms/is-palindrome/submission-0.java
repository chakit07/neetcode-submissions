class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right=s.length()-1;
        while(left<right){
            //when i and j pointer find non alphanumeric value
            char i=s.charAt(left);
            char j=s.charAt(right);

            if(!Character.isLetterOrDigit(i)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(j)){
                right--;
                continue;
            }

            if(Character.toLowerCase(i)!=Character.toLowerCase(j)){
                return false;
            }
            left++;
            right--;

        } 
        return true;
    }
    
}
