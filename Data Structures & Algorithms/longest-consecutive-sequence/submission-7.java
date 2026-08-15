class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
        }

        int temp = pq.poll();
        int count = 1;
        int max = 1;

        while (!pq.isEmpty()) {
            int num = pq.poll();

            if (temp == num) {
                // Duplicate → ignore
                continue;
            }

            if (temp + 1 == num) {
                count++;
            } else {
                count = 1;
            }

            temp = num;
            max = Math.max(max, count);
        }

        return max;
    }
}