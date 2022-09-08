package Day11;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public static List<List<Integer>> combine(int n, int k) {
      var lists= new ArrayList<List<Integer>>();
        rec(1,n, k, new ArrayList<Integer>(),lists);
        return lists;
    }


    public static void rec(int idx,int n,int k,List<Integer>list,List<List<Integer>> lists)
    { System.out.println("new rec");
        if(list.size()==k)
        {
           System.out.println("k==");
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i <=n; i++) {
            list.add(i);
            System.out.println(i+"i ul"+list.size());
            rec(i+1, n, k, list,lists);
            list.remove(list.size()-1);
        }
       

    }
        public static void main(String[] args) {
         var lists=  combine(4, 2);
            for (var man : lists) {
                for (var s : man) {
                    System.out.print(s+" ");
                }
                System.out.println("newline");
            }
        }
}
