import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        long arr[] = new long[100000];
        long n = scnr.nextLong();
        long max, maxCnt = 0;
        arr[0] = scnr.nextLong();
        max = arr[0];
        
        for(int i=1; i<n; i++)
        {
            arr[i] = scnr.nextLong();
            if(arr[i] > max)
                max = arr[i];
        }
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] == max)
                maxCnt++;
        }
        
        System.out.print(maxCnt);
    }
}