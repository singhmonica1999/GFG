Given an array of size n and a range [a, b]. The task is to partition the array around the range such that the array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Note: The generated output is 1 if you modify the given array successfully.

Geeky Challenge: Solve this problem in O(n) time complexity.

Example 1:

Input: 
n = 5
array[] = {1, 2, 3, 3, 4}
[a, b] = [1, 2]
Output: 
1
Explanation: 
One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be 1.


class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int n=array.length;
        int high=n-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(array[mid]<a){
                int temp=array[mid];
                array[mid]=array[low];
                array[low]=temp;
                mid++;
                low++;
                
            }
            else if (array[mid]>b){
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
            else mid++;
        }
        
        
        // code here 
        
    }
}
