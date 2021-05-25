import java.util.Arrays;

class RotateArray {

    RotateArray(){
      int[] nums= {1,2,3,4,5,6,7};
      rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println((i + k) % nums.length + "-------" + nums[i]);
          a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
          nums[i] = a[i];
        }
      }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
    }
}
