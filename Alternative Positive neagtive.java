// Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.

// Note:
// - Resulting array should start with a positive integer (0 will also be considered as a positive integer).
// - If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.
// - The array may or may not have equal number of positive and negative integers.

// Examples:

// Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
// Output: [9, -2, 4, -1, 5, -5, 0, -3, 2]
// Explanation: The positive numbers are [9, 4, 5, 0, 2] and the negative integers are [-2, -1, -5, -3]. Since, we need to start with the positive integer first
// and then negative integer and so on (by maintaining the relative order as well), hence we will take 9 from the positive set of elements and then
// -2 after that 4 and then -1 and so on.


class Solution {
    void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> arr1=new  ArrayList<Integer>();
         ArrayList<Integer> arr2=new  ArrayList<Integer>();
         for(int i=0;i<arr.size();i++){
             if(arr.get(i)>=0){
                 arr1.add(arr.get(i));
             }
             if(arr.get(i)<0){
                 arr2.add(arr.get(i));
             }
         }
        int i=0,j=0,k=0;
        while(i<arr1.size()&& j<arr2.size()){
            arr.set(k++,arr1.get(i++));
            arr.set(k++,arr2.get(j++));
            
        }
        while(i<arr1.size()){
            arr.set(k++,arr1.get(i++));
            
        }
         while(j<arr2.size()){
            arr.set(k++,arr2.get(j++));
            
        }
        
        // code here
    }
}