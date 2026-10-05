class Solution {
    
    public String countAndSay(int n) {
        String result="1";

        for(int i=2;i<=n;i++)
        {
            String a="";
            for(int j=0;j<result.length();j++)
            {
                char current=result.charAt(j);
                int count=1;

                while((j+1<result.length()) && (result.charAt(j+1)==current))
                {
                    count++;
                    j++;
                }
                a=a+count+current;
            }
            result=a;
        }
        return result;
    }
}