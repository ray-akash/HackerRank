import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int arr[] = new int[n];
        int pairs, pairsCount = 0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scnr.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] == -1)
                continue;
            else
            {
                pairs = 1;
                for(int j=i+1; j<n; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        arr[j] = -1;
                        pairs++;
                    }
                }
                if(pairs%2 == 0)
                    pairsCount += (pairs/2);
                else if(pairs%2 != 0)
                    pairsCount += ((pairs-1)/2);
            } 
        }
        
        System.out.print(pairsCount);
    }
}