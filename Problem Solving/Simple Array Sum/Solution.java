import java.util.*;
class Solution{
    public static void main(String args[])
    {
        List<Integer> ar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum=0;
        
        for(int i=0; i<n; i++){
            ar.add(sc.nextInt());
            sum += ar.get(i);
        }
        
        System.out.print(sum);
    }
}