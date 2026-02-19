package dailyCodeChallenge.day5;

import java.util.Scanner;

public class PrintingContineousPrimeNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //output n = 50; print all prime number from 1 to 50;
        if(n<=1)
        {
            System.out.println("Not a primeNumber");
        }
        else
        {
            for(int i = 2;i<=n;i++)
            {
                boolean flag = true;
                for(int j = 2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
