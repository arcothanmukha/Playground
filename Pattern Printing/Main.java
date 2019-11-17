import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sn = new Scanner(System.in);
      int row = sn.nextInt();
      int column = sn.nextInt();
      int count=row;
      for(int i=1;i<=row;i++)
      {
        for(int j=row;j>=1;j--)
        {
          if(j<=count)
          {
            System.out.print(count);
          }
          else if(j>count)
            System.out.print(j);
        }
        System.out.println();
        count--;
      }
    }
}