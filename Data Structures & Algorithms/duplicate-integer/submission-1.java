class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}


// using HashSet to track seen numbers
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         HashSet <Integer> seen=new HashSet<>();
//         for(int num:nums){
//             if(seen.contains(num)){
//                 return true;
//             }
//             seen.add(num);
//         }
//         return false;
//     }
// }