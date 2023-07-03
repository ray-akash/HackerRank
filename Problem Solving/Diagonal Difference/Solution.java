import java.util.*;
import java.lang.Math;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        List<Integer> ar = new ArrayList<Integer>();
        int n = scnr.nextInt();
        int d1 = 0, d2 = 0;
        
        for(int i=0; i<n*n; i++)
        {
            ar.add(scnr.nextInt());
            
            if( i%(n+1) == 0){
                d1 += ar.get(i);
            }    
            if( i%(n-1) == 0 && i != 0 && i < (n*n)-1 ){
                d2 += ar.get(i);
            }
        }
        
        System.out.print(Math.abs(d1-d2));
    }
} 
