public class RmDuplicate1 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        RmDuplicate1 obj = new RmDuplicate1();
        int k = obj.removeDuplicates(nums);

        System.out.println("Unique count: " + k);

        // Print updated array (only first k elements)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}