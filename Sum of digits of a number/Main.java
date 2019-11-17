import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int k=0;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      while(n>0)
      {
        k=k+n%10;
        n=n/10;
      }
      System.out.println(k);
	}
}