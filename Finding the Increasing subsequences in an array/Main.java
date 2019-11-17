import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sn.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[j]>arr[i])
        {
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
  }
}