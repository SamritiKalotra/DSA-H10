class Solution {

    public void solve(int[] nums, List<List<Integer>> ans, int index) {

        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            ans.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // recursive call
            solve(nums, ans, index + 1);

            // backtrack
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, ans, 0);

        return ans;
    }
}
