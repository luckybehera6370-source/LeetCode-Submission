class Solution {
    public String reverseWords(String s) {
        StringBuffer ans = new StringBuffer();
        String str[] = s.split(" ");

        for(int i=0;i<str.length;i++){
            

             if(ans.length() > 0 ){
                ans.append(" ");
            }
            
            for(int j=str[i].length()-1;j>=0;j--){
                char ch = str[i].charAt(j);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}