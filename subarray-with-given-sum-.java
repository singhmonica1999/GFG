https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/11

//User function Template for Java

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