package Day14;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
       
       HashSet<Integer> res=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            
            if(!res.contains(nums[i]))
            {
                res.add(nums[i]);
            }
            else
            {
                res.remove(nums[i]);
            }
        }
        for (Integer integer : res) {
            return integer;
        }
        return -1;
    }
}
