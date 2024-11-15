Union of Arrays with Duplicates
// User function Template for Java
Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

Note: Elements are not necessarily distinct.

Examples

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
Output: 5
Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union setof both arrays. So count is 5.



class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
      HashSet<Integer>s =new HashSet<>();
      for(int i=0;i<a.length;i++){
          s.add(a[i]);
      }
       for(int i=0;i<b.length;i++){
          s.add(b[i]);
      }
      return s.size();
    }
}