package Day12;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        
        for(int i = 2; i <= n; i++)
            result[i] = result[i - 1] + result[i - 2];
        
        return result[n];
    
    }
}
