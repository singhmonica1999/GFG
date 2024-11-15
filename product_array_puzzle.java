// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int arr[]) {
        
       int len=arr.length;
        long[] leftarr=new long[len];
     if (len == 1) {
            leftarr[0] = 1;
            return leftarr;
        }
       long left=1;
      
      
        for (int i = 0; i < len; i++) leftarr[i] = 1;
      
       for(int i=0;i<len;i++){
           leftarr[i]=left;
           left*=arr[i];
           
       }
       left=1;
       for(int i=len-1;i>=0;i--){
           leftarr[i]*=left;
           left*=arr[i];
           
       }
      
      return leftarr;
    
        // code here
    }
}
