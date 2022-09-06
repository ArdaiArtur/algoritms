package Day9;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrange {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu=new LinkedList<>();
        int total=0,tt=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==2)
                {
                qu.add(new int[]{i,j});
                }
                if(grid[i][j]==1)
                {
                    total++;
                }
            }
        }
        int db=-1;
        int[][]d=new int [][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!qu.isEmpty())
        {
            int size=qu.size();
            for (int m = 0; m < size; m++) {
                
            
            var me=qu.poll();

            for (int i = 0; i < 4; i++) {
                int ni=me[0]+d[i][0];
                int nj=me[1]+d[i][1];
               
                if(ni>=0&&nj>=0&&ni<grid.length&&nj<grid[0].length)
                {
                    if(grid[ni][nj]==1)
                    {tt++;
                    qu.add(new int []{ni,nj});
                    grid[ni][nj]=2;
                    }
                }
            }
        }
            db++;

        }
       if(db==-1)
       db=0;
        return tt==total?db:-1;
    }
}
