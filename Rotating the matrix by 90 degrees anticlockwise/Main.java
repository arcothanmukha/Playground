import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sn = new Scanner(System.in);
    int r = sn.nextInt();
    int c = sn.nextInt();
    int[][] arr = new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        arr[i][j]=sn.nextInt();
    for(int i=c-1;i>=0;i--)
    {
      for(int j=0;j<r;j++)
      {
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
  }
}