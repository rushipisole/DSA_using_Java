public class searchInsertPosition {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 2;

        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
