import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sn = new Scanner(System.in);
    String str= sn.nextLine();
    if(str.charAt(0)=='J')
      System.out.println("Java full stack");
    else
      System.out.println("I AM STRONG");
  }
}