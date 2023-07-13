import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int steps = scnr.nextInt();
        char path[] = scnr.next().toCharArray();
        int pos = 0, count = 0;
        
        for(int i=0; i<steps; i++)
        {
            if(path[i] == 'U')
                pos++;
            else if(path[i] == 'D')
                pos--;
                
            if(pos == 0 && path[i] != 'D')
                count++;
        }
        
        System.out.print(count);
    }
}