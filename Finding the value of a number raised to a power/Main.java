import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sn = new Scanner(System.in);
      int base = sn.nextInt();
      int exponent = sn.nextInt();
      int result=1;
      while(exponent>0)
      {
        result=result*base;
        exponent--;
      }
      System.out.println(result);
    }
}