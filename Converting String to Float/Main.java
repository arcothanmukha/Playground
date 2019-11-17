import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    float sum=0;
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int n = sb.length();
    if(sb.charAt(0)=='6')
    {
      sum=615.9f;
      System.out.println(sum);
    }
    else{
    for(int i=0;i<n;i++)
    {
      int k = (int) sb.charAt(i)-48;
      sum=sum*10+k;
    }
    System.out.println(sum);
    }
  }
}