// Minimize the Heights II
import java.util.Arrays;

class Solution {
        public int getMinDiff(int[] arr, int k) {
            int n=arr.length;
            if (n == 1) return 0;
                    
            Arrays.sort(arr);
                                    
            int min = arr[0];
            int max = arr[n - 1];
            int ans = max - min;
                                                            
            for (int i = 1; i < n; i++) {
                if (arr[i] - k < 0) continue; // skip if decrease leads to negative
                                                                                    
                int currMax = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                int currMin = Math.min(arr[0] + k, arr[i] - k);
                ans = Math.min(ans, currMax - currMin);
            }
            return ans;
        }
}
