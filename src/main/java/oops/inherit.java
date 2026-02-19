package oops;
class Bank
{
    String username;
    String passowrd;
   public  void setUsername(String name,String password)
   {
       this.username = name;
       this.passowrd = password;
   }
   public String user()
   {
       return username;
   }
   public String pass()
   {
       return passowrd;
   }
}
class Savings extends Bank
{
    public void useParrentPropertied()
    {
        setUsername("sds","ssd");
        System.out.println(username);
        System.out.println(passowrd);

    }
}
class Current extends Bank
{
    public void useParrentPropertied()
    {
        setUsername("sds","ssd");
        System.out.println(username);
        System.out.println(passowrd);

    }
}
public class inherit  extends Bank
{
    public static void main(String[] args)
    {
        Current obj  = new Current();
        System.out.println(obj.passowrd);
    }
}
