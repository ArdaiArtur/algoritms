package Day2;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        
    }
    public int[] sortedSquaress(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
           nums[i]=nums[i]*nums[i];
       }
       Arrays.sort(nums);
       return nums;
   }
    public int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) return null;
       int[] res = new int[nums.length];
       int left = 0;
       int right = nums.length - 1;
       int pos = nums.length - 1;
       while(pos >= 0){
           int num1 = nums[left]*nums[left];
           int num2 = nums[right]*nums[right];
           if(num1 > num2){
               left++;
               res[pos] = num1;
           }
           else{
               right--;
               res[pos] = num2;
           }
           pos--;
       }
       return res;
   }
}
