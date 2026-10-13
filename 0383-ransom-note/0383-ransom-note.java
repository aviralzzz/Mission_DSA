class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        int a=ransomNote.length();
        int b=magazine.length();

        for(int i=0;i<a;i++)
        {
            freq[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<b;i++)
        {
            char ch=magazine.charAt(i);
            if(freq[ch-'a']!=0)
            {
                freq[ch-'a']--;
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
            count++;
        }
        if(count==0)
        return true;
        else  return false;

        
    }
}