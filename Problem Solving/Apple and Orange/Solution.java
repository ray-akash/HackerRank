// NOTE: Avoid using arrays to store values since that will take O(m + n) space.
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int strt, end, apTree, orTree, apCnt, orCnt, apInRnge = 0, orInRnge = 0;
        strt = scnr.nextInt();
        end = scnr.nextInt();
        apTree = scnr.nextInt();
        orTree = scnr.nextInt();
        apCnt = scnr.nextInt();
        orCnt = scnr.nextInt();
        
        int apFall = 0, orFall = 0;
        
        for(int i=0; i<apCnt; i++)
        {
            apFall = scnr.nextInt();
            apFall += apTree;
            if(apFall >= strt && apFall <= end)
                apInRnge++;
        }
        for(int i=0; i<orCnt; i++)
        {
            orFall = scnr.nextInt();
            orFall += orTree;
            if(orFall >= strt && orFall <= end)
                orInRnge++;
        }
        
        System.out.print(apInRnge+"\n"+orInRnge); 
    }
}