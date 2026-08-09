class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        // pairing max price with max discount to increase the saving
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int maxPrice=prices.length-1;
        int maxDiscount=discounts.length-1;

        double sum=0;

        while(maxPrice>=0 && maxDiscount>=0){
            sum+=prices[maxPrice]*(100.0-discounts[maxDiscount])/100.0;
            maxPrice--;
            maxDiscount--;
        }

        while(maxPrice>=0){
            sum+=prices[maxPrice--];
        }
        return sum;
    }
}