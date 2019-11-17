import java.util.Scanner;
class Main
{
  public static int facto(int n)
  {
    if(n==1)
      return 1;
    else
      return n*facto(n-1);
  }
  public static void main(String args[])
  {
    // your code here
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
     int k = facto(n);
    System.out.println(k);
  }
}