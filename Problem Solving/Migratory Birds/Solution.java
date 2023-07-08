import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int arr[] = new int[n];
        int frequency[] = {0,0,0,0,0};
        int maxFreq = 0, maxId = 0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scnr.nextInt();
            
            if(arr[i] == 1)
                frequency[0]++;
            if(arr[i] == 2)
                frequency[1]++;
            if(arr[i] == 3)
                frequency[2]++;
            if(arr[i] == 4)
                frequency[3]++;
            if(arr[i] == 5)
                frequency[4]++;
        }
        
        for(int i=4; i>=0; i--)
        {
            if(frequency[i] >= maxFreq)
            {
                maxFreq = frequency[i];
                maxId = i+1;
            }    
        }
        
        System.out.print(maxId);
    }
}