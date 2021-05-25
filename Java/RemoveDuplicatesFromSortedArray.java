import java.util.Arrays;

class RemoveDuplicatesFromSortedArray {

    RemoveDuplicatesFromSortedArray() {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // System.out.println(removeDuplicates(nums));
        // System.out.println(Arrays.toString(nums));
        int[] nums2 = { 1,2,3,4 };
        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, duplicateCount = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                System.out.println("if " + nums[i] + "------" + nums[j] );
                duplicateCount++;
            }
            else {
                System.out.println("else " + nums[i] + "------" + nums[j] );
                i++;
                if (duplicateCount > 0) {
                    nums[i] = nums[j];
                    System.out.println("else>if " + nums[i] + "------" + nums[j] );
                    // duplicateCount = 0;
                }
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
    }
}
