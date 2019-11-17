import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    int k=0;
    Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=sn.nextInt();
    int r = sn.nextInt();
    for(int j=0;j<r;j++)
    {
      if(n%2==0)
      {
      k = a[n-2];
      for(int i=n-2;i>1;i=i-2)
        a[i]=a[i-2];
      a[0]=k;
      k = a[1];
      for(int i=1;i<=n-3;i=i+2)
        a[i]=a[i+2];
      a[n-1]=k;
      }
      else
      {
        k = a[n-1];
      for(int i=n-1;i>1;i=i-2)
        a[i]=a[i-2];
      a[0]=k;
      k = a[1];
      for(int i=1;i<=n-3;i=i+2)
        a[i]=a[i+2];
      a[n-2]=k;
      }
  	}
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
}
}