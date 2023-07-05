import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in); 
        String userTime = scnr.nextLine();
        
        String time[] = userTime.split(":");
        //System.out.println(time[0]+" "+time[1]+" "+time[2]);
        
        String tFormat = time[2].substring(2,4); //endIndex's exclusive
        //System.out.println(tFormat);
        
        int hh, mm, ss;
        hh = Integer.parseInt(time[0]);
        mm = Integer.parseInt(time[1]);
        ss = Integer.parseInt(time[2].substring(0,2));
        //System.out.println(hh+" "+mm+" "+ss);
        
        if(tFormat.equals("PM") && hh != 12)
            hh +=12;
        if(tFormat.equals("AM") && hh == 12)
            hh = 0;
            
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }
}
