//Stock Buy and Sell – Multiple Transaction Allowed
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int first=0;
        int sum=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<prices[i-1] ){
                sum+=prices[i-1]-prices[first];
                // System.out.println(first);
                first=i;
            }
            else if(i== prices.length-1) sum+=prices[i]-prices[first];
        }
        return sum;
    }
}
