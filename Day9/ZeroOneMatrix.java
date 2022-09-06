package Day9;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int row =mat.length;
        if(row==0) return mat;
        int col=mat[0].length;
        int [][] fin =new int[row][];
        for(int i=0; i<row; i++)
        {
            fin[i]=new int[col];
            Arrays.fill(fin[i], Integer.MAX_VALUE);
        }
        Queue<int[]> qu=new LinkedList<>();

        for (int i = 0; i < fin.length; i++) {
            for (int j = 0; j < fin[0].length; j++) {

                if(mat[i][j]==0) 
                
                {
                    fin[i][j]=0;
                    qu.add(new int[]{i,j});

                }
            }
        }
        int[][] dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        
        while (!qu.isEmpty()) {
            var loc=qu.poll();
            for (int i = 0; i < 4; i++) {
                int new_row = loc[0]+dir[i][0];
                int new_col = loc[1]+dir[i][1];

                if(new_row>=0 && new_col>=0 && new_row<row && new_col<col)
                {
                    if(fin[new_row][new_col]>fin[loc[0]][loc[1]]+1)
                    {
                        fin[new_row][new_col]=fin[loc[0]][loc[1]]+1;
                        //Add the newly updated neighbour to the queue to visit later.
                        qu.add(new int[]{new_row, new_col});
                    }
                }
            }
        }
        return fin;

    }
}
