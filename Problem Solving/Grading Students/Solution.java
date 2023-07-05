import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int marks[] = new int[101];
        int n = scnr.nextInt();
        
        for(int i=0; i<n; i++)
        {
            marks[i] = scnr.nextInt();
            
            if(marks[i] > 37)
                if(marks[i]%5 > 2)
                {
                    int quo = marks[i]/5;
                    marks[i] = (quo+1) * 5;
                }
            
            System.out.println(marks[i]);       
        }
    }
}
