// Day 4 - Rotate Array

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        int l=arr.length-1;
        d=d%(l+1);
        reverse(arr,0,l);
        reverse(arr,0,l-d);
        reverse(arr,l-d+1,l);
    }
    static void reverse(int[] arr, int first, int last){
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}
