class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        char arr[]=s1.toCharArray();
        Arrays.sort(arr);
         char arr2[]=s2.toCharArray();
         boolean bl=false;
         Arrays.sort(arr2);
         if(s1.length()!=s2.length()){
         return false;}
         else{
         for(int i=0;i<s1.length();i++){
             if(arr[i]!=arr2[i])
             {
                  return false;
                  
             }
             bl=true;
        
             
         }}
       if(bl)
        return true;
        else
        return false;
    }
}

//optimized

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        int h1[]=new int[26];
        Arrays.fill(h1,0);
        for(int i=0;i<s1.length();i++){
            h1[s1.charAt(i)-'a']++;
        }
         for(int i=0;i<s2.length();i++){
            h1[s2.charAt(i)-'a']--;
        }
         for(int i=0;i<h1.length;i++){
           if( h1[i]!=0)
           {
               return false;
           }
        }
        return true;
    }
}






