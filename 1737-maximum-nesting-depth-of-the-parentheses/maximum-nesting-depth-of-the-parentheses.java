class Solution {
    public int maxDepth(String s) {
         int depth=0;  
        int openBrackets = 0;
        
        for(char c:s.toCharArray()){
            if(c=='('){
              openBrackets++; 
            }else if(c==')'){
                openBrackets--;
            }
            depth=Math.max(depth,openBrackets);

        }

        return depth;
    }
}