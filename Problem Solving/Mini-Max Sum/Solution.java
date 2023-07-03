import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[5];
        long sum, max, min;
        arr[0] = sc.nextLong();
        sum = max = min = arr[0];
        
        for(int i=1; i<5; i++)
        {
            arr[i] = sc.nextLong();
            sum += arr[i];
            
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
    
        System.out.print((sum-max) +" " +(sum-min));
    }
}