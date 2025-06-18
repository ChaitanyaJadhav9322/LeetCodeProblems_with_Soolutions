//Time Complexity = O(n)
//Space Complexity = O(n)
class Solution {
    public int longestSubarray(int[] nums, int k) {
       int maxLen = 0 ;
       int sum = 0;
    
       Map <Integer , Integer > map = new HashMap<>();

       for(int i = 0 ; i < nums.length ; i++)
       {
        sum+=nums[i];

        if(sum == k)
        {
            maxLen = i + 1 ;
        }

        if(map.containsKey(sum - k))
        {
            maxLen = Math.max(maxLen ,i - map.get(sum - k));
        }


        if(!map.containsKey(sum))
        {
            map.put(sum , i );
        }
       }

       return maxLen;
    }
}
