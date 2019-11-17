import java.util.Scanner;
public class Main{
  public static int check (int n,int k)
  {
    while(n!=k)
     {
      if(n>k)
        n=n-k;
      else
        k=k-n;
    }
    if(n>=2)
      return n;
    else
      return 1;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int k = sn.nextInt();
      int j = sn.nextInt();
      int l=check(n,k);
      int m=check(l,j);
      System.out.println(m);
	}
}