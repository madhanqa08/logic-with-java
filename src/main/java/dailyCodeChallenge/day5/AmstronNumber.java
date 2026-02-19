package dailyCodeChallenge.day5;

public class AmstronNumber
{
    public static void main(String[] args) {

       String s = "153";
       int sum = 0;
       for(int i = 0;i<s.length();i++)
       {
           int n = s.charAt(i) - '0';
           int pow = (int)Math.pow(n,s.length());
           sum  = sum + pow;
       }
       if(Integer.parseInt(s)==sum)
       {
           System.out.println("Amstrong number");
       }
       else {
           System.out.println("Not a Amstrong number");
       }

    }
}
