/* Naming conventions used:
*   kan1    -> initial position of 1st Kangaroo
*   kan2    -> initial position of 2nd Kangaroo
*   jmp1    -> jumping rate of 1st Kangaroo
*   jmp2    -> jumping rate of 2nd Kangaroo
*   pos1    -> position of 1st Kangaroo
*   pos1    -> position of 2nd Kangaroo
*   diff[0] -> difference between initial postions of both kangaroos.
*   diff[1] -> difference between postions of both kangaroos after a jump.
*   difOdiff-> difference between difference in initial postion of both kangaroos.
*/
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int kan1, kan2, jmp1, jmp2, pos1, pos2;
        int diff[] = new int[3];
                
        kan1 = scnr.nextInt();
        jmp1 = scnr.nextInt();
        kan2 = scnr.nextInt();
        jmp2 = scnr.nextInt();
        
        for(int i=1; i<=2; i++)
        {
            pos1 = kan1+(i-1)*jmp1;     // An = A+(n-1)d    -> formula from Arth. Progeression
            pos2 = kan2+(i-1)*jmp2;
            diff[i-1] = pos1-pos2;
        }
        
        //System.out.println("Difference: "+diff[0]+" "+diff[1]);
        
        int difOdiff = diff[1]-diff[0];
        //System.out.println("diffODiff: "+difOdiff);
    
        if(diff[0] < diff[1])
        {
            for(int i=1; diff[0]+difOdiff*i < 10000; i++)
            {
                //System.out.println(diff[0]+difOdiff*i);
                if(diff[0]+difOdiff*i == 0)
                {
                    System.out.println("YES");
                    break;
                }
                if(diff[0]+difOdiff*i > 0)
                {
                    System.out.println("NO");
                    break;
                }
            }
        }
        else
            System.out.println("NO");
    }
}