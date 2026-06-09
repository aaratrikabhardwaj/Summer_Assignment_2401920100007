class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
       
        char temp;
        for(int j=0;j<l/2;j++)
        {
            temp=s[j];
            s[j]=s[l-1-j];
            s[l-1-j]=temp;
        }
        
    }
}
