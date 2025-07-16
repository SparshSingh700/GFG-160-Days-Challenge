//Day1 Second Largest.
class Solution {
    public int getSecondLargest(int[] arr) {
        int max=-1;
        int max2=-1;
        if(arr.length<2){
            return -1;
        }
        
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){  
                max=arr[i];
            } 
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=max && arr[j]>max2){
                max2=arr[j];
            }
            
        }
        
        return max2;
    }
}
