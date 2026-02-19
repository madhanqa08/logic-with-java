package dailyCodeChallenge.day5;

public class FibSeries
{
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 2;i<=n;i++)
        {
            int sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;

        }
        // output : 0,1,1,2,3,5,8,13
    }
}
