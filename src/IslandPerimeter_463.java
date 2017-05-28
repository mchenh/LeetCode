/*
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16
Explanation: The perimeter is the 16 yellow stripes in the image below: (NO PICTURE)
 */
public class IslandPerimeter_463 {
  public int islandPerimeter(int[][] grid) {
    int result = 0;
    
    for(int i=0; i<grid.length; i++) {
        for(int j=0; j<grid[i].length; j++) {
            if(grid[i][j] == 1)
            {
                //Checks top and bottom map pieces
                //top or bottom piece
                if(i==0 || i==grid.length-1) {
                    if(i==0){
                        result++;
                        if(i+1 < grid.length)
                            if(grid[i+1][j] == 0)
                                result++;
                    }
                    if(i==grid.length-1) {
                        result++;
                    
                        if(i-1 > -1)
                            if(grid[i-1][j] == 0)
                                result++;
                    }    
                }  //middle
                else {
                    if(grid[i-1][j] == 0)
                        result++;
                    if(grid[i+1][j] == 0)
                        result++;
                }
                
                //Checks left and right map pieces
                //left or right piece
                if(j==0 || j==grid[i].length-1) {
                    if(j==0) {
                        result++;
                        
                        if(j+1 < grid[i].length)
                            if(grid[i][j+1] == 0)
                                result++;
                    } 
                    if(j==grid[i].length-1) {
                        result++;
                        
                        if(j-1 > -1)
                            if(grid[i][j-1] == 0)
                                result++;
                    } 
                } //middle
                else {
                    if(grid[i][j+1] == 0)
                        result++;
                    if(grid[i][j-1] == 0)
                        result++;
                }
            }
        }
    }
    
    return result;
}
}