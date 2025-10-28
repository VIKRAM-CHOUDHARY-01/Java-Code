class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> ans=new HashSet<>();

        for(int val : nums1){
            s1.add(val);
        }

        for(int val : nums2){
            if(s1.contains(val)){
                ans.add(val);
            }
        }

        int n=ans.size();

        int[] res=new int[n];

        int i=0;
        for(int val : ans){
            res[i]=val;
            i++;
        }

        return res;
        
    }   
}

public class IntersectionArray{
    public static void main(String[]args){
        int arr[] = {1,2,3,4};
        int arr2 = {2,3,6,5};
        Solution obj = new Solution();
        obj.intersection(arr, arr2);
    }
}