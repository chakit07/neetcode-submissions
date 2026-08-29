class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int f = 0; f < nums.length; f++) {
            // edge case handle
            if (f > 0 && nums[f] == nums[f - 1]) {
                continue;
            }

            int i = f + 1;
            int j = nums.length - 1;
            
            while (i < j) {

                int target=nums[f]+nums[i]+nums[j];

                if(target>0){
                    j--;
                }
                else if(target<0){
                    i++;
                }
                else{
                    result.add(Arrays.asList(nums[f],nums[i],nums[j]));
                    i++;
                    
                    while(nums[i]==nums[i-1] && i<j){
                        i++;
                    }

                    while(nums[j]==nums[j-1] && i<j){
                        j--;
                    }
                }
            }
        }
        return result;
    }
}
