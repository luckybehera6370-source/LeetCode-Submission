class Solution {
    public boolean checkString(String s) {
        boolean bSeen = false;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                bSeen = true;
            }else if(bSeen){
                return false;
            }
        }
        return true;
    }
}