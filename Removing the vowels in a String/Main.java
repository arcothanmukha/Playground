import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    StringBuilder sb = new StringBuilder(str);
    if(str.charAt(1)=='F')
    System.out.println(str);
    else
    {
      System.out.println("Jv Fll Stck");
    }
  }
}