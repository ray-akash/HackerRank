import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int loopCounter = 0, flag = 0; 
        int n = scnr.nextInt();      
        
        int ranked[] = new int[n];
        ranked[0] = scnr.nextInt();
        for(int i=1; i<n; i++) 
        {
            loopCounter++;
            if(loopCounter == n) break;
            
            ranked[i] = scnr.nextInt();
            if(ranked[i] == ranked[i-1])
            {
                ranked[i] = -1;
                i--;
            }
            flag = i;
        }
        
        int m = scnr.nextInt();
        int player[] = new int[m];
        for(int i=0; i<m; i++) { player[i] = scnr.nextInt(); }
        
        for(int i=0; i<m; i++)
        {
            for(int j=flag; j>=0; j--)
            {
                if(player[i] <= ranked[j])
                {
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}