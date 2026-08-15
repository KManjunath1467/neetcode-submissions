class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>set = new HashSet<>();
       for(int num : nums){
            set.add(num);
       }
       int max = 0;
        for (int num : set) {

            // Start only if num is the beginning
            if (!set.contains(num - 1)) {

                int count = 1;

                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }


       return max;
    }
}
