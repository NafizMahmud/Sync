import java.util.*;

public class Equilibrium_Index {

Equilibrium_Index(){
    int[] nums = {-1, 3, -4, 5, 1, -6, 2, 1};
    int[] frontPass = new int[nums.length];
    int[] backPass = new int[nums.length];

    for(int i = 1,j=nums.length-2; i < nums.length && j >= 0; i++,j--){
      frontPass[i] = frontPass[i-1] + nums[i-1];
      backPass[j] = backPass[j+1] + nums[j+1];
    }
    for(int i =0;i<frontPass.length;i++){
        if(frontPass[i]  == backPass[i]){
            System.out.println(i);
        }
    }

}
    public static void main(String[] args) {
        Equilibrium_Index solution = new Equilibrium_Index();
    }
}
