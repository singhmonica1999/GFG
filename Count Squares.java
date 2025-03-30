// Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to find the number of integers less than n in the sample space.

// Examples :

// Input: n = 9
// Output: 2
// Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.
https://www.geeksforgeeks.org/problems/count-squares3649/1

class Solution {
    static int countSquares(int n) {
        int count=(int)Math.sqrt(n-1);
        // int count=0;
        // for(int i=1;i<n;i++){
        //     if(Math.pow(i,2)<n)
        //     count++;
        // }
        return count;
        // code here
    }
}