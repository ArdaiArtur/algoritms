package Day2;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        
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
