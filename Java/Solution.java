class Solution {
    public int removeDuplicates(int[] nums) {
        // 2 pointer appraoch
        // i is the slow runner
        // j is the fast runner
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j-1]){
                 nums[i+1] = nums[j];
                i++;}
        }
        return i+1;
    }
    public static void main(String[] args) {
        System.out.println("Test Hello, World.");
    }
}