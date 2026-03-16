class Solution {
    public int countCommas(int n) {
    // 1–3 digits → 0 commas
    // 4–6 digits → 1 comma
    // 7–9 digits → 2 commas
    // 1-999  -> no comma
    // 1,000  1,001  1,002 ...
        int ans =0;
        for(int i=0;i<=n;i++){
            int d=Integer.toString(i).length();
            ans+=(d-1)/3;
        }
        return ans;
    }
}