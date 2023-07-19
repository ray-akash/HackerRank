//IMPOROVISE ON YOUR VARIABLE NAMING CONVENTIONS
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int t = scnr.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int n = scnr.nextInt();
            int k = scnr.nextInt();
            int s = 0;
            
            int a[] = new int[n];
            for(int j=0; j<n; j++)
            {
                a[j] = scnr.nextInt();
                if(a[j] <= 0)
                    s++;
            }
            if(s >= k)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}