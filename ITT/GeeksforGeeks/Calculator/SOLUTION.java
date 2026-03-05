import java.util.*;
class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int operator=sc.nextInt();
        Solution s=new Solution();
        s.calculate(a,b,operator);
    }
    public void calculate(int a, int b, int operator) {
        // code here
        if(operator==1)
        {
            System.out.println(a+b);
        }
        else if(operator==2)
        {
            System.out.println(a-b);
            
        }
        else if(operator==3)
        {
            System.out.println(a*b);
        }
        else 
        {
             System.out.println("Invalid Input");
        }
    }
}
