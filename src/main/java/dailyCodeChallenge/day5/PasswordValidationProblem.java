package dailyCodeChallenge.day5;

import java.util.Scanner;

public class PasswordValidationProblem {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int up = 0;
        int low = 0;
        int digit = 0;
        int sym =0;
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                digit++;
            }
            else if(Character.isUpperCase(c))
            {
                up++;
            }
            else if(Character.isLowerCase(c))
            {
                low++;
            }
            else
            {
                sym++;
            }
        }
        if(digit!=0 && up!=0 && low!=0 && sym!=0 && s.length()>=8)
        {
            System.out.println("Your Password is Strong");
        }
        else
        {
            System.out.println("Your Password is Not Strong");
        }
    }
}
