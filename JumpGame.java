public class JumpGame {

    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // If current index is not reachable
            if (i > maxReach) {
                return false;
            }

            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        boolean result = canJump(nums);
        System.out.println("Can reach end: " + result);
    }
}