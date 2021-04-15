class Binary_Search {
    int[] nums = {5,7,8,8,8,10};
    int target = 8;
    int leftTarget = -1, rightTarget = -1;
    Binary_Search(){

        System.out.println(binarykensaku(0,nums.length));
    }


     int binarykensaku(int left, int right) {
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {leftTarget=mid;
                return mid; }
            else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Binary_Search solution = new Binary_Search();
    }
}
