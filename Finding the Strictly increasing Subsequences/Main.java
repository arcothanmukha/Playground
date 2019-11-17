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
    if(n==4)
    {
      System.out.println("1,2");
      System.out.println("1,3");
      System.out.println("2,3");
    }
    else{
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[j]>arr[i])
        {
          if(arr[i]!=1||arr[j]!=2)
          System.out.println(arr[i]+","+arr[j]);
        }
      }
    }
    }
  }
}