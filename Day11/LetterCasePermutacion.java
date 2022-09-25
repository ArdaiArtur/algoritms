package Day11;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutacion {
    public List<String> letterCasePermutation(String s) {
        var lists= new ArrayList<String>();
        
        rec(s.toCharArray(), lists,0);
        return lists; 
    }


    public static void rec(char [] s,List<String> lists,int idx)
    {
        if(idx==s.length)
        {
            lists.add(new String(s));
            return;
        }    
        if(Character.isLetter(s[idx]))
        {
         if(Character.isUpperCase(s[idx]))
         {
            s[idx]=Character.toLowerCase(s[idx]);
            rec(s, lists, idx+1);
            s[idx]=Character.toUpperCase(s[idx]);

         }
         else
         {
            s[idx]=Character.toUpperCase(s[idx]);          
            rec(s, lists, idx+1);
             s[idx]=Character.toLowerCase(s[idx]);
         }

        }
        rec(s, lists, idx+1);
    }
}
