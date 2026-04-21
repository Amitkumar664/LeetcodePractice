public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        MajorityElement obj = new MajorityElement();
        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }

    public int majorityElement(int[] nums) {
        int cand = 0;   // Moore's Voting Algorithm
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }

            if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return cand;
    }
}