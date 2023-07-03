import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        double arr[] = new double[100];
        double n = scnr.nextDouble();
        double pos=0.0, neg=0.0, zero=0.0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = scnr.nextDouble();
            
            if(arr[i] == 0)
                zero++;
            else if(arr[i] > 0)
                pos++;
            else if(arr[i] < 0)
                neg++;
        }
        
        System.out.printf("%.6f\n",pos/n);
        System.out.printf("%.6f\n",neg/n);
        System.out.printf("%.6f\n",zero/n);
    }
}
