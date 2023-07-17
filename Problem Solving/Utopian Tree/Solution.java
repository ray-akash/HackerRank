import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int t = scnr.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int flag = 0, height = 1;
            int cycle = scnr.nextInt();
            for(int j=0; j<cycle; j++)
            { 
                flag++; 
                if(flag%2 == 1)
                    height += height;
                else if(flag%2 == 0)
                    height++;
            }
            System.out.println(height);
        }
    }
}