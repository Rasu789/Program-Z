import java.util.Scanner;
class Solution {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        utility(number);
    }
    public static void utility(int number) {
        if(number>100)
        {
            System.out.println("Big");
            System.out.println("Number");
        }
        else if(number<=100)
        {
        // Write your if statement above
           System.out.println("Number");
        }
    }
}
