class Solution {
    public String clearDigits(String s) {
        int l=s.length();
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(st.size()==0)
            st.push(ch);
            
            else if((Character.isDigit(st.peek()) && !Character.isDigit(ch)) || (!Character.isDigit(st.peek()) && Character.isDigit(ch)))
            st.pop();
        
            else
            st.push(ch);
        }   
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}