class Solution {
    public String defangIPaddr(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='.')
            {
                ans+="[.]";
            }
            else
            {
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}