//Stock Buy and Sell – Max one Transaction Allowed

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min=prices[0];
        int amount=0;
        for(int i=1; i<prices.length;i++){
            if(min<prices[i]){
                amount=Math.max(amount, prices[i]-min);
            }
            else{
                min=prices[i];
            }
        } return amount;
    }
}
