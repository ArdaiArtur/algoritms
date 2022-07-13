package Day4;

public class ReversWordsinaStringIII {
    public static void main(String[] args) {
        String s="man";
    
    }
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}
