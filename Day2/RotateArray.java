package Day2;

public class RotateArray {
    public static void main(String[] args) {
        
    }
    public void rotate(int[] nums, int k) {
        int []a=new int[nums.length];
       for (int i = 0; i < a.length; i++) {
           a[(i+k)%a.length]=nums[i];
       }
         for (int i = 0; i < a.length; i++) {
           nums[i]=a[i];
       }
     }
}
