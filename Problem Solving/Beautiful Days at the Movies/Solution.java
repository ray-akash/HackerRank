import java.util.Scanner;
import java.math.*;
class Solution
{
    static int reverse(int num)
    {
        int rem = 0, rev=0;
        while(num>0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }
        return rev;
    }
    
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int rangeStart = scnr.nextInt();
        int rangeEnd = scnr.nextInt();
        int divisor = scnr.nextInt();
        int dayCount = 0;
        
        for(int i=rangeStart; i<=rangeEnd; i++)
        {
            if(Math.abs(i - reverse(i))%divisor == 0)
                dayCount++;
        }
        
        System.out.print(dayCount);

    }
}
