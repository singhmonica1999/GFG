https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1

//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i])
            {
                max=arr[i];
            }
            
        }
        return max;
    }
}