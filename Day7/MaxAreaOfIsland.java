package Day7;

import java.sql.Wrapper;
import java.util.Stack;

public class MaxAreaOfIsland {
   
    public int maxAreaOfIsland(int[][] grid) {
      int max=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
              Stack<Integer>count=new Stack<>();
                if(grid[i][j]==1)
                dfs(grid, i, j, count,0);
                max=Math.max(max, count.size());
            }
        }
        return max;
    }
    public void dfs (int[][] grid,int i,int j, Stack<Integer>  count,int szam )
    {
        if(i>=0&&j>=0&&i<grid.length&&j<grid[0].length&&grid[i][j]==1)
        {
            grid[i][j]=2;
            szam++;
            count.add(szam);
            dfs(grid, i-1, j, count,szam);
            dfs(grid, i+1, j, count,szam);
            dfs(grid, i, j+1, count,szam);
            dfs(grid, i, j-1, count,szam);
        }

    }
}
