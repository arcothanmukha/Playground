import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=i;j<n;j++)
          System.out.print(" ");
        for(int j=1;j<=2*i-1;j++)
          System.out.print("*");
        System.out.println("");
      }
	}
}