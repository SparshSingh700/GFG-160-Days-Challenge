// User function Template for Java
import java.util.Arrays;

class Solution {
void nextPermutation(int[] arr) {
int l = arr.length - 1;
int n = l + 1;
int ind = -1;
                                    
// Step 1: Find the breakpoint (from right, where arr[i] < arr[i+1])
for (int i = l; i > 0; i--) {
    if (arr[i] > arr[i - 1]) {
    ind= i - 1;
    break;
    }
}
                                                    
if (ind == -1) {
    reverse(arr, 0, l);  
    return;
}
                                                            
                                                                    
for (int i = l; i > ind; i--) {
    if (arr[i] > arr[ind]) {
    swap(arr, ind, i);
    break;
    }
}
                                                                            
                                                                                  
Arrays.sort(arr, ind + 1, n); 
}
        
void reverse(int[] arr, int first, int last) {
while (first < last) {
    swap(arr, first, last);
    first++;
    last--;
    }
 }
            
void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
                }
}
