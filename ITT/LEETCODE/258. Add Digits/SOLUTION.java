class Solution {
    public int addDigits(int num) {
        if(num==0)
        {
            return 0;
        }
        else if(num<=9)
        {
            return num;
        }
        else
        {
            return 1+(num-1)%9;
        }
    }
}
