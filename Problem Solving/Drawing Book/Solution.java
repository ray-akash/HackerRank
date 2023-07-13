import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int p = scnr.nextInt();
        
        int min = (n/2) - (p/2);
        
        /*
        *   n/2 -> gives total turn required to reach the last page
        *   p/2 -> gives total turn required to reach the target 
        *          page from front
        *   min -> gives total turn required to reach the target
        *          page from back
        */
        
        if(min > p/2)
            min = p/2;
            
        System.out.print(min);
    }
}