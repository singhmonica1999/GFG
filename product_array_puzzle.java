c:\Users\Lenovo\GFG\transpose - Copy (2).java
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int count=0;
int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}

//opimized
class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length;
        int count=0;
int cols=grid[0].length-1;
int row=0;
int col=0;
while(row<rows && cols>=0){
if(grid[row][cols]>=0){
    row++;
}
else{
    count+=rows-row;
    cols--;
}
}
return count;

    }
}