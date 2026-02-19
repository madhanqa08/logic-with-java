package dailyCodeChallenge.day5;

import java.util.Scanner;

public class IncrementEveryDigitExceptNine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        for(int i = 0;i<s.length();i++)
        {
            int c = (s.charAt(i)-'0');
            if(c!=9)
            {
                System.out.print(c+1);
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
