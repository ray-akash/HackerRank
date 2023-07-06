// I bet, you won't even try to understand it after few days !!
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int m = scnr.nextInt();
        int n = scnr.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int maxOfA=0, minOfB=101;
        int flag = 0;
    
        for(int i=0; i<m; i++)
        {
            a[i] = scnr.nextInt();
            if(a[i] > maxOfA)
                maxOfA = a[i];
        }
        for(int i=0; i<n; i++)
        {
            b[i] = scnr.nextInt();
            if(b[i] < minOfB)               
                minOfB = b[i];
        }
    
        for(int i=maxOfA; i<=minOfB; i++)
        {
            int j=0, k=0;
            while(j<m)
            {
                if(i%a[j] != 0)
                {
                    break;                
                }
                j++;
            }
        
            if(j==m)
            {
                while(k<n)
                {
                    if(b[k]%i != 0)
                    {
                        break;                
                    }
                    k++;
                }
            }
            if(k==n)
                flag++;
        }
    
        System.out.println(flag);
    }
}
