package Day4;

public class ReversWordsinaStringIII {
    public static void main(String[] args) {
        String s="man";
    
    }
    public String reverseWords(String s) {
        String rev="";
        for (String st : s.split(" ")) {
            rev=rev+strev(st);
        }
        return rev;
    }

    public static String strev(String s)
    {
        char []dd=s.toCharArray();
        int i=0;
        int j=s.length();
        while(i<j)
        {
            char ch=dd[j];
            dd[j]=dd[i];
            dd[i]=ch;
        }
        return dd.toString();
    }
}
