package Day11;

import java.util.ArrayList;
import java.util.List;

public class Permutacion {
    public List<List<Integer>> permute(int[] nums) {
        var lists= new ArrayList<List<Integer>>();
        int n=nums.length;
        rec(n, new ArrayList<Integer>(),lists, nums);
        return lists;
    }


    public static void rec(int n,List<Integer>list,List<List<Integer>> lists,int []nums)
    {
        if(list.size()==n)
        {
         
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i <n; i++) {
           if(list.contains(nums[i])) continue;
            list.add(nums[i]);
          //  System.out.println(i+"i ul"+list.size());
            rec( n, list,lists,nums);
            list.remove(list.size()-1);
        }
}

}
