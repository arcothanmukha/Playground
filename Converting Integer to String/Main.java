import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    int l=0;
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    StringBuilder sb = new StringBuilder();
    int k = n;
    if(n>0)
    {
      while(k>0)
      {
        l=k%10;
        char ch = (char)('0'+l);
        sb.append(ch);
        k/=10;
      }
      sb.reverse();
      System.out.println(sb);
    }
    else
    {
      k=-n;
      while(k>0)
      {
        l=k%10;
        char ch = (char)('0'+l);
        sb.append(ch);
        k/=10;
      }
      sb.append("-");
      sb.reverse();
      System.out.println(sb);
    }
  }
}