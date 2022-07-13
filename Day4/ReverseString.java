package Day4;

/**
 * ReverseString
 */
public class ReverseString {

    public void reverseString(char[] s) {
        rev(s,0,s.length-1);
    }
    public void rev(char[]s,int i,int j)
    {
        if(i>j) return ;
            
        char a=s[i];
        s[i]=s[j];
        s[j]=a;
        i++;
         j--;
         rev(s,i,j);
        
        
        
    }
}