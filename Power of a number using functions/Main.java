import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int m = sn.nextInt();
      int k = power(n,m);
      System.out.println(k);
	}
    public static int power(int n ,int m)
    {
      int po=n;
      for(int i=2;i<=m;i++)
        po=po*n;
      return po;
    }
}