class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums, int i, List<Integer> list) {

        // Every current list is a valid subset
        result.add(new ArrayList<>(list));

        for (int j = i; j < nums.length; j++) {

            // Choose
            list.add(nums[j]);

            // Explore
            backtrack(nums, j + 1, list);

            // Undo
            list.remove(list.size() - 1);
        }
    }
}