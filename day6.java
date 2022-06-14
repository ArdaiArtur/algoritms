import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

/**
 * day6
 */
public class day6 {

     public static void main(String[] args) {
       
        }
     public int LengthOfLongestSubstring(String s) {
     int max=0;
     int i=0,j=0;
     HashMap<Character,Integer>map=new HashMap<>();
     while(j<s.length())
     {
        char c=s.charAt(j);
        if(map.containsKey(c))
        {map.put(c, map.get(c)+1);}
        else
        {
            map.put(c, 1);
        }
        if(map.size()==(j-i+1))
        {
            max=Math.max(max, (j-i+1));
        }
        if(map.size()<(j-i+1))
        {
            while(map.size()<(j-i+1))
            {
                char tmp=s.charAt(i);
                 if(map.containsKey(tmp))
                 {
                     map.put(tmp, map.get(tmp)-1);
                 }
                 if(map.get(tmp)==0)
                 {
                     map.remove(tmp);
                 }
                 i++;
            }
            
        }
        j++;
     }
        return max;
     }
     public int LengthOfLongestSubstrin(String s) {
        Queue<Character> slidingWindow = new LinkedList<Character>();
        int maxLength=0;
		int i=0;
        while(i<s.length()){
           if(slidingWindow.contains(s.charAt(i))){
               char current;
               do {
                    current=slidingWindow.remove();
               } while(current!=s.charAt(i)); 
           }
            
          slidingWindow.add(s.charAt(i));  
          
          maxLength = Math.max(slidingWindow.size(),maxLength);
          i++;
        }
        
        return maxLength;
    
     }
}