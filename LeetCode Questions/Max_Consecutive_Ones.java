//Given a binary array nums, return the maximum number of consecutive 1's in the array.
        class Solution {
            public int findMaxConsecutiveOnes(int[] nums) {
                int max = 0;
                int count = 0;
                for(int i =0;i<nums.length;i++){
                
                    if(nums[i]==1){
                        count++;
                    if(count>max){
                        max = count;
                    }
                        continue;
                    }
                
                
                    count = 0;
                }
                return max;
            }
        }