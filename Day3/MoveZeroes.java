package Day3;

public class MoveZeroes {
    public static void main(String[] args) {
        
    }
    public  static void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length)
        {
            if(nums.length>j)
            {
                if(nums[j]!=0)
                {
                nums[i]=nums[j];
                i++;
                }

            }
            else{
                nums[i]=0;
                i++;
            }
            j++;
        }
    }
}
