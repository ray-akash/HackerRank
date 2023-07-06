import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        long scores[] = new long[n];
        long maxScore, minScore;
        int maxCount=0, minCount=0;
        
        maxScore = minScore = scores[0] = scnr.nextLong();
        
        for(int i=1; i<n; i++)
        {
            scores[i] = scnr.nextLong();
            if(scores[i] > maxScore)
            {
                maxCount++;
                maxScore = scores[i];
            }
            if(scores[i] < minScore)
            {
                minCount++;
                minScore = scores[i];
            }
        }
        
        System.out.print(maxCount+" "+minCount);
    }
}
