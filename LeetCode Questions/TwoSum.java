class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j = 1+i;j<nums.length;j++){
                if(nums[i] + nums[j]==target){
                ans[0] = i;
                ans[1] = j;
            }
            }
           
        }
        return ans;
    }   
}


//Optimal Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}