import java.math.*;
import java.util.Scanner;
import java.util.Arrays;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int arr[] = new int[n];
        int flag, length = 0;
        
        for(int i=0; i<n; i++) { arr[i] = scnr.nextInt(); }
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++)
        {
            flag = 0;
            for(int j=i; j<n; j++)
            {
                if(Math.abs(arr[i]-arr[j]) <= 1)
                    flag++;
            }
            length = flag>length?flag:length;     
        }
        
        System.out.print(length);
    }
}