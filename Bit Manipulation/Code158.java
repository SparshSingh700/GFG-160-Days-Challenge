// gfg Missing in Array
class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length;
        int res=arr[0]^1;
        for(int i=1; i<n;i++){
             res=(res^arr[i])^i+1;
            }res=res^n+1;
        return res;
    }
}
