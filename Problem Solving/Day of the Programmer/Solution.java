import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int year = scnr.nextInt();
        
        if(year < 1918)
        {
            if(year%4 == 0)
                System.out.print("12.09."+year);
            else
                System.out.print("13.09."+year);
        }
        else if(year == 1918)
            System.out.print("26.09."+year);
        else
        {
            if(year%4 == 0)
            {
                if(year%100 != 0)
                    System.out.print("12.09."+year);
                else if(year%400 == 0)
                    System.out.print("12.09."+year);
                else
                    System.out.print("13.09."+year);
            }
            else
                System.out.print("13.09."+year);
        }
    }
}