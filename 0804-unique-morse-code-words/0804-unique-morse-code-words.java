class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int n=words.length;
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        HashSet<String> s=new HashSet<>();
        for(String word:words)
        {
            StringBuilder ans=new StringBuilder();
            for(char c:word.toCharArray())
            {
                ans.append(morse[c-'a']);
            }
            s.add(ans.toString());
        }
        return s.size();
    }
}