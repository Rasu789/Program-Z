class Solution {
    public static void main(String [] args)
    {
        Solution s=new Solution();
        int n=5;
        System.out.println(s.factorial(n));
    }
    public int factorial(int n) {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
