import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int k = scnr.nextInt();
        int bill[] = new int[n];
        int bTotal=0, bActual;
        
        for(int i=0; i<n; i++)
        {
            bill[i] = scnr.nextInt();
            bTotal += bill[i];
        }
        
        int bCharged = scnr.nextInt();
        bActual = (bTotal - bill[k])/2;
        
        if(bCharged == bActual)
            System.out.print("Bon Appetit");
        else
            System.out.print(bCharged-bActual);
    }
}