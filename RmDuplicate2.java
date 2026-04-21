public class RmDuplicate2 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        RmDuplicate2 obj = new RmDuplicate2();
        int k = obj.removeDuplicates(nums);

        System.out.println("Allowed count (max 2 duplicates): " + k);

        // Print updated array (first k elements)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int num : nums) {
            if (k < 2 || num != nums[k - 2]) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }
}