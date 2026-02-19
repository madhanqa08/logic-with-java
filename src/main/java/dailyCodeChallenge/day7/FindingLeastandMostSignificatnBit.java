package dailyCodeChallenge.day7;

import java.util.Scanner;

public class FindingLeastandMostSignificatnBit
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        s = Integer.toBinaryString(Integer.parseInt(s));
//        System.out.println("Binary :"+s);
        int sum = 0;
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='1')
            {
                sum++;
            }
        }
        int m = -1;
        int p1 = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            {
                m = p1;
                break;
            }
            p1++;
        }
        int l = -1;
        int p2 = s.length()-1;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                l = p2;
                break;
            }
            p2--;
        }
        System.out.println(sum+"#"+m+"#"+l);
    }
}
