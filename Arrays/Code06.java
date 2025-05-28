// Function to find the majority elements in the array

import java.util.*;
class Solution {
    public List<Integer> findMajority(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap();
        ArrayList<Integer> arr=new ArrayList<>();
        int l=nums.length;
        for(int i=0; i<l; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int n=l/3;
        for(int key: map.keySet()){
            int count=map.get(key);
            if(count>n){
                arr.add(key);
            }
        }
        return arr;
    }
}
