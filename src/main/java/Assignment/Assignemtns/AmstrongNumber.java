package Assignment.Assignemtns;

public class AmstrongNumber
{
    public static void main(String[] args) {
        String num = "153";
        int lenght = num.length();
        int sum = 0;
        int temp = Integer.parseInt(num);
        for(int i = 0;i<num.length();i++)
        {
            char c = num.charAt(i);
            int n =  c-'0';
            int pow = (int)Math.pow(n,lenght);
            sum = sum + pow;
        }
        if(temp==sum)
        {
            System.out.println("Given Number is Amstrong Number");
        }
        else {
            System.out.println("Given Number is not Amstrong Number");
        }
    }
}
