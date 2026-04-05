class Solution {
    public boolean judgeCircle(String moves) {
        int countUD=0;
        int countLR=0;
        

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') countUD++;
            else if(moves.charAt(i)=='D') countUD--;
            else if(moves.charAt(i)=='R') countLR++;
            else countLR--;
        }
        return (countLR==0 && countUD==0);
    }
}