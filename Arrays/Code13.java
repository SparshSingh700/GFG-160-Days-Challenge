//Gfg Smallest Positive Missing.
class Solution {
    // Function to find the smallest positive missing number
    public int missingNumber(int[] arr) {
        // Place each number in its correct position if possible
        for(int i = 0; i < arr.length; i++){
            while(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]){
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        // Find the first index where number is not correct
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        // If all numbers are correct, missing number is length+1
        return arr.length + 1;
    }
}
