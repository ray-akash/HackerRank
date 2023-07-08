import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int divisor = scnr.nextInt();
        int arr[] = new int[n];
        int sumPair, count=0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scnr.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                sumPair = arr[i] + arr[j];
                if(sumPair%divisor == 0)
                    count++;
            }
        }
        
        System.out.print(count);
    }
}