import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int height[] = new int[26];
        for(int i=0; i<26; i++) { height[i] = scnr.nextInt(); }
        String word = scnr.next();
        int max = 0;
        
        for(int i=0; i<word.length(); i++)
        {
            if(height[word.charAt(i)-97] > max)
                max = height[word.charAt(i)-97];
        }
        
        System.out.print(max*word.length());
    }
}