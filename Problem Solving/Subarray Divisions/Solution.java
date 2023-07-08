import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int cBar[] = new int[n];
        int count=0, d;
        
        for(int i=0; i<n; i++)
        {
            cBar[i] = scnr.nextInt();
        }
        
        int day = scnr.nextInt();
        int month = scnr.nextInt();
        
        for(int i=0; i<n; i++)
        {    
            d = 0;
            int k;
            for(k=i; k<month+i; k++)
            {
                d += cBar[k]; 
            }
            if(d == day)
                count++;
            if(k == n)
                break;
        }
        
        System.out.print(count);
    }
}