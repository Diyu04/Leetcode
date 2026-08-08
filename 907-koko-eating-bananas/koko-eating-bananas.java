class Solution {

    public boolean canFinish(int[] piles,int h,int k){
        long hours=0;
        for(int pile:piles){
            hours+=pile/k;
            if(pile%k!=0)hours++;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // [3,6,7,11]  h=8  
        // min speed= 1 banana/hour   // max speed = 11 bananas/hour
        // BINARY SEARCH 
        int left=1;
        int right=piles[0];

        for(int pile:piles){
            right=Math.max(right,pile);
        }

        while(left<=right){
            int mid=left+(right-left)/2;

            if(canFinish(piles,h,mid)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;



    }
}