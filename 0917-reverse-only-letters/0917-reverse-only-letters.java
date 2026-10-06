class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        char[] c=s.toCharArray();
        int  j=c.length-1;
        while (i < j) {
            if (!Character.isLetter(c[i])) {
                i++; 
            } else if (!Character.isLetter(c[j])) {
                j--;
            } else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }        
        return new String(c);
    }
}