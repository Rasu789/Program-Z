class Solution {
    public static void main(String [] args )
    {
        int a=10;
        int b=4;
        int c=7;
        int d=9;
        Solution s=new Solution();
        System.out.println(s.calculate(a,b,c,d));
    }
    public int calculate(int a, int b, int c, int d) {
        // code here
        int e=((a+b)/c)+d;
        return e;
        
    }
}
