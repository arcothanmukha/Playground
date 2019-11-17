import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int sum=0,sum1=0;
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=sn.nextInt();
    if(n==6)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}