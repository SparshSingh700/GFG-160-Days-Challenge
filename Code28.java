// gfg Number of occurrence
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low= find(arr, target, true);
        int high= find(arr,target, false);
        if(low==-1 || high==-1) return 0;
        return high-low +1;
    }
    int find(int[] arr,int target, Boolean  first){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                ans=mid;
                if(first==true){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
