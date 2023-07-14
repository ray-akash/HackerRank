import java.math.*;
import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int cost = Integer.MAX_VALUE;
        int magicSqr[][] = {
                                {4,9,2,3,5,7,8,1,6},
                                {4,3,8,9,5,1,2,7,6},
                                {2,9,4,7,5,3,6,1,8},
                                {2,7,6,9,5,1,4,3,8},
                                {8,1,6,3,5,7,4,9,2},
                                {8,3,4,1,5,9,6,7,2},
                                {6,7,2,1,5,9,8,3,4},
                                {6,1,8,7,5,3,2,9,4},
                            };

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                matrix[i][j] = scnr.nextInt();
            }
        }
        
        int temp = 0;
        for(int i=0;i<8;i++)
        {
            temp = Math.abs(matrix[0][0]-magicSqr[i][0]) +Math.abs(matrix[0][1]-magicSqr[i][1]) +Math.abs(matrix[0][2]-magicSqr[i][2]) +Math.abs(matrix[1][0]-magicSqr[i][3]) +Math.abs(matrix[1][1]-magicSqr[i][4]) +Math.abs(matrix[1][2]-magicSqr[i][5]) +Math.abs(matrix[2][0]-magicSqr[i][6]) +Math.abs(matrix[2][1]-magicSqr[i][7]) +Math.abs(matrix[2][2]-magicSqr[i][8]);
            cost = temp<cost?temp:cost;
        }
        
        System.out.print(cost);
    }
}