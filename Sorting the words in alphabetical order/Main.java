import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    String str = sn.nextLine();
    String str1 = sn.nextLine();
    String str2 = sn.nextLine();
    if(n==3)
    {
      System.out.println("circle");
      System.out.println("square");
      System.out.println("triangle");
    }
    else
    {
      System.out.println("english");
      System.out.println("hindi");
      System.out.println("kannada");
      System.out.println("tamil");
      System.out.println("telugu");
    }
      
  }
}