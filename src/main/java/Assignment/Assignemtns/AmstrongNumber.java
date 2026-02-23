package Assignment.Assignemtns;

import java.util.Scanner;

public class AmstrongNumber
{
    public static void run(int num)
    {
        try
        {
            if(num<0)
            {
                num = num *-1;
            }
            String str = String.valueOf(num);
            int lenght = str.length();
            int sum = 0;
            int temp = Integer.parseInt(str);
            for(int i = 0;i<str.length();i++)
            {
                char c = str.charAt(i);
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
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        // Step 1 : Get any Number from the user in string format and store in num variable
        // Step 2 : Finding length of numusing .length() method and store in a temporary variable method length
        // Step 3 : Initializing a variable called sum and assigning 0 to it
        // Step 4 : Parsing the giving input into Integer using parseInt method
        // Step 5 : Iterating the loop from 0 to the length of num
        //Step 6  : Getting each character in a variable c and convert into Number Integer format called n
        // Step 7 : Powering the n using the length of the num and store in the variable called pow
        // Step 8 : For each iteration add the sum value by pow and store in the sum value
        // Step 9 : Check if the sum is eqaul to num if yes pring "Amstrong number" and not "Print "not a amstrong"
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        run(num);
        // Test case for Amstrong Number
        /*
            1. Verify the input using null input (Empty)
            Ex : Program should not run and throw "Please enter a number"
            2. Verify the input using characters ("Madhan")
            Ex : It accepts only Number format and throw only Integers are allowed
            3. Verify the input using special characters ("@#$)
            Ex : Throws error and print "Only Integer are allowed"
            4. Verify using the valid input (153)
            Ex : Program will run and print "The given number is Armstrong number"
            5. Verify using the invalid input (154)
            Ex : Program will run and print "The given number is not Armstrong Number"
            6. Verify the input using negative numbers (-153)
            Ex : Program will run and print "The given number is Armstrong number"
            7. Verify the input using the value 0
            Ex : Ex : Program will run and print "The given number is not Armstrong Number"
            8. Verify the input using AlphaNumeric
            Ex : Ex : Throws error and print "Only Integer are allowed"




         */
    }
}
