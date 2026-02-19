package dailyCodeChallenge.day5;

import java.util.Scanner;

public class JonathanMaximumValueFindingSum
{
    public static int methodOne(int n1,int n2)
    {
        n2 = n1+n2;
        int a = 500 - (n1*2);
        int b = 1000-(n2*4);
        int sum = a+b;
        return sum;
    }
    public static int methodTwo(int n1,int n2)
    {
        n1 = n1+n2;
        int a = 1000 - (n2*4);
        int b = 500 - (n1*2);
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 0;i<num;i++)
        {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int m1 = methodOne(n1,n2);
            int m2 = methodTwo(n1,n2);
            int max = (int)Math.max(m1,m2);
            System.out.println(max);
        }
    }
}
