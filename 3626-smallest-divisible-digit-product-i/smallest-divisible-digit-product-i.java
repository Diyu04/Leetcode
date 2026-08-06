class Solution {

    public int smallestNumber(int n, int t) {
        // Among any 10 consecutive integers there's exactly one multiple of 10, which has a 0 digit and    thus product 0 (divisible by any t). So the answer is always within [n, n+9]
        for (int i = n; i <= n + 9; ++i) {
            int product = 1;
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0)
                return i;
        }
        return -1; // unreachable.
    }
}