//Day3 - Reverse an Array 
class Solution {
    public void reverseArray(int arr[]) {
        int i=0;
        int n=arr.length-1;
        while(i<=n/2){
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
            i++;
        }
    }
}
