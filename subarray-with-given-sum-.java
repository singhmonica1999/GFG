//Given an unsorted array arr containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.

// Examples:

// Input: arr[] = [1,2,3,7,5], target = 12
// Output: [2, 4]
// Explanation: The sum of elements from 2nd to 4th position is 12.


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum=0;
        boolean bl=false;
        ArrayList<Integer> arrr=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
         long currsum=arr[i]; 
         if(currsum==target){
             arrr.add(i+1);
             arrr.add(i+1);
              bl=true;
             break;
         }
         else{
             for(int j=i+1;j<arr.length;j++){
                 currsum += arr[j];
                 if(currsum==target){
                     arrr.add(i+1);
                     arrr.add(j+1);
                     bl=true;
                     break;
                 }
             }
         }
         if(bl)
         break;
        }
        if (bl)
        return arrr;
        else{
          arrr.add(-1);
          return arrr;
}}}

//optimized

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int currsum=0;
        int start=0;
        boolean finds=false;
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum>=target){
                if(currsum==target)
                {
                    arr1.add(start+1);
                     arr1.add(i+1);
                     finds=true;
                 return arr1;
                    
                }
                currsum-=arr[start];
                start++;
            }
        }
       
        arr1.add(-1);
        return arr1;
}
    
}