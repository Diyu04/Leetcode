class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;

        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i))){
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n){
        // 10^6 = 1111 01000010 01000000
        // most amount of set bits will be 19
        // all primes upto 19 are : 2,3,5,7,,11,13,17,19

        return (n==2 || n==3 || n==5 || n==7  || n==11 || n==13 || n==17 || n==19);
    }
}