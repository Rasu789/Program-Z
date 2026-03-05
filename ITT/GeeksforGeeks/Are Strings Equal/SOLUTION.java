// User function Template for Java
class Solution {
    public static void main(String[] args)
    {
        String s1="hello";
        String s2="hello";
        System.out.println(areEqual(s1,s2));
    }
    public static boolean areEqual(String s1, String s2) {
        // Your code here
        if(s2.equals(s1))
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}
