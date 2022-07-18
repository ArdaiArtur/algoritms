package Day6;


import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstringWithoutRepeatingCharacters {
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
