import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        long arr[] = new long[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextLong();
            
            if(i>0)
                arr[0] += arr[i];
        }
        
        System.out.print(arr[0]);
        
    }
}