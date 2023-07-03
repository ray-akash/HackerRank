import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int s = n;
        
        for(int i=0; i<n; i++)
        {
            for(int j=s; j>1; j--)
            {
                System.out.print(" ");
            }
            
            for(int k=0; k<=i; k++)
            {
                System.out.print("#");
            }
            System.out.println();
            s--;
        }
    }
}
