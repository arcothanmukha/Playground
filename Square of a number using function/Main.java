import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int s=0;
    s=n*n;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int s=square(n);
      System.out.println(s);
	} 
}