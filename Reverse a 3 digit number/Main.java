import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int a=0;
    Scanner sn = new Scanner(System.in);
    int n=sn.nextInt();
    while(n>0)
    {
      a=a*10+n%10;
      n=n/10;
    }
    System.out.println(a);
  }
}