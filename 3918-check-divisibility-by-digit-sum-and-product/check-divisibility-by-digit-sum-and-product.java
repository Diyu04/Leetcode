class Solution {
    public boolean checkDivisibility(int n) {
        int digSum=0;
        int digProduct=1;
        int temp=n;

        while(temp!=0){
            int dig=temp%10;
            digSum+=dig;
            digProduct*=dig;
            temp/=10;
        }
        int total=digSum+digProduct;

        return n%total==0;
    }
}