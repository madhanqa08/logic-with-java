package dailyCodeChallenge.day5;

import java.util.Scanner;

public class FindingPrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<=1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            boolean f = true;
            for(int i = 2;i<n;i++)
            {
                if(n%i==0)
                {
                    f = false;
                    break;
                }
            }
            if(f)
            {
                System.out.println(n+" is prime number");
            }
            else
            {
                System.out.println("Not a prime number");
            }
        }
    }
}
