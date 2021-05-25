class FindRangeOfElementInSortedArray {

    FindRangeOfElementInSortedArray() {
        int[] nums = {5};
        int target = 8;
        System.out.println(binarySearchLeft(nums, target));
        System.out.println(binarySearchRight(nums, target));
    }

    int binarySearchLeft(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (left <= nums.length-1) && nums[left] == target ? left: -1;
    }

    int binarySearchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (right >= 0) && nums[right] == target ? right: -1;
    }

    public static void main(String[] args) {
        FindRangeOfElementInSortedArray solution = new FindRangeOfElementInSortedArray();
    }
}
