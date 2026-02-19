package dailyCodeChallenge.day7;

import java.util.Scanner;

public class AtmWithdrawalProgram
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 0;i<n;i++)
        {
            StringBuilder res = new StringBuilder();
            int ppl = input.nextInt();
            int bal = input.nextInt();
            for(int j = 0;j<ppl;j++)
            {
                int wd = input.nextInt();
                if(bal>=wd)
                {
                    bal = bal - wd;
                    res.append("1");
                }
                else
                {
                    res.append("0");
                }
            }
            System.out.println(res);
        }

    }
}
