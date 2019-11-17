import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    int n = (str.length())/2;
    int q = n;
    int k = str.length();
    int l = k;
    int count=0;
    int count1=0;
    for(int i=0;i<k;i++)
    {
      for(int j=1;j<l;j++)
        System.out.print(" ");
      l--;
      for(int r=q;r<=n;r++)
        System.out.print(str.charAt(r));
      if(n==k-1)
       count1++;
      if(count1>=2)
      {
        count++;
        for(int j=0;j<count;j++)
          System.out.print(str.charAt(j));
      }
      if(n<k-1)
        n++;
      System.out.println();
    }
  }
}