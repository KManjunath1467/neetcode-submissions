class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] nums = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(digits, 0, new StringBuilder(), result, nums);

        return result;
    }

    public void backtrack(String digits, int index,
                          StringBuilder sb,
                          List<String> result,
                          String[] nums) {

        // All digits processed
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        // Get letters corresponding to current digit
        int digit = digits.charAt(index) - '0';

        String letters = nums[digit];

        // Try every letter
        for (char ch : letters.toCharArray()) {

            // Choose
            sb.append(ch);

            // Explore next digit
            backtrack(digits, index + 1, sb, result, nums);

            // Undo
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}