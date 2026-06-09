
class Solution {
    public boolean isPalindrome(String s) {
        int f=0,l=s.length()-1;
        s=s.toLowerCase();
        while(f<=l){
            if( Character.isLetterOrDigit(s.charAt(f) )&& Character.isLetterOrDigit(s.charAt(l))){

            if(s.charAt(f)==s.charAt(l)){
                f++;
                l--;
                continue;
            }
            else
                return false;
           
        }
            else
            {
                if(!(Character.isLetterOrDigit(s.charAt(f)))){
                    f++;
                }
                 if(!(Character.isLetterOrDigit(s.charAt(l)))){
                    l--;
                 }
            }

        
        
    }
    return true;
}
}
