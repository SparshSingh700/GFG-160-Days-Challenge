//gfg Maximum Product Subarray
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int minPro=arr[0];
        int maxPro=arr[0];
        int result=arr[0];
        for(int i=1; i<arr.length;i++){
            int cur=arr[i];
            if(cur<0){
                int temp=maxPro;
                maxPro=minPro;
                minPro=temp;
            }
            
            minPro=Math.min(cur, cur*minPro);
            maxPro=Math.max(cur, cur*maxPro);
            result=Math.max(result, maxPro);
        }
        return result;
        
    }
}
