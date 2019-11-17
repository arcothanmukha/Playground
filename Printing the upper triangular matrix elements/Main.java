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
    int k = 0;
    while(k<r)
    {
      for(int i=0,j=k;i<r&&j<c;i++,j++)
        System.out.print(arr[i][j]+" ");
      k++;
    }
  }
}