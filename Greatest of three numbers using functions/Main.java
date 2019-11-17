import java.util.Scanner;
class Main{
  public static int check (int n,int k)
    {
    if(n>k)
      return n;
    else
      return k;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int k = sn.nextInt();
      int j = sn.nextInt();
      int l=check(n,k);
      if(l>j)
        System.out.println(l);
      else
        System.out.println(j);
	}
}