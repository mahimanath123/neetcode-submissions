class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();

        int start = nums[0];
        int count = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            }

            if(nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                map.put(start, count);
                start = nums[i];
                count = 1;
            }
        }

        map.put(start, count);

        return Collections.max(map.values());
    }
}