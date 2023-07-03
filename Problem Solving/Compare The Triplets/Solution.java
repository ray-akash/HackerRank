import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int aArr[] = new int[5];
        int bArr[] = new int[5];
        int aRes=0, bRes=0;
        
        for(int i=0; i<3; i++)
        {
            aArr[i] = sc.nextInt();
        }
        for(int i=0; i<3; i++)
        {
            bArr[i] = sc.nextInt();
        }
        
        for(int i=0; i<3; i++)
        {
            if(aArr[i] > bArr[i])
                aRes++;
            else if(aArr[i] < bArr[i])
                bRes++;
        }
        
        System.out.print(aRes +" " +bRes );
    }
}
