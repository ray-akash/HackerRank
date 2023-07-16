import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int max = 0;
        int n = scnr.nextInt();
        int k = scnr.nextInt();
        int hurdle[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            hurdle[i] = scnr.nextInt();
            if(hurdle[i] > max)
                max = hurdle[i];
        }
        
        if(max < k)
            System.out.print("0");
        else
            System.out.print(max-k);
    }
}