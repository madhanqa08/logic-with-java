package Assignment.Assignemtns;

public class ChnageIndex
{
    public static void main(String[] args)
    {
        //change odd index to upper case
        String name = "madhan";
        name = name.toLowerCase();
        for(int i = 0;i<name.length();i++)
        {
            char c = name.charAt(i);
            if(i%2==0)
            {
                System.out.print(Character.toUpperCase(c));
            }
            else
            {
                System.out.print(name.charAt(i));
            }
        }
    }
}
