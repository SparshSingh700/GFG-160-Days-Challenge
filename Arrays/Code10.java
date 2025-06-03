// Kadane's Algorithm
class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int i=1;
        int l=arr.length;
        if(l==0) return 0;
        int sum=arr[0];
        int maxSum=arr[0];
        while(i<l){
            sum=Math.max(arr[i], arr[i]+sum);
            maxSum=Math.max(sum,maxSum);
            i++;
        }
        return maxSum;
    }
}
