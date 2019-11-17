import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    int count=0;
    Scanner sn = new Scanner(System.in);
    int r = sn.nextInt();
    int c = sn.nextInt();
    int[][] a = new int[r][c];
    int[][] b = new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        a[i][j]=sn.nextInt();
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        b[i][j]=sn.nextInt();
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
       if(a[i][j]!=b[i][j])
       {
         count++;
         break;
       }
    if(count==0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}