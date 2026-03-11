class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
         int ans = 0, x;
         int i=0;
    while(n > 0) {
      if (n % 2 == 1) {
        x = 0;
      }
      else {
        x = 1;
      }
      ans += (int)Math.pow(2, i) * x;
      n /= 2;

      i++;
    }
    return ans;
    }
}