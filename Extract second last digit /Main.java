import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      n=n/10;
      int a=n%10;
      System.out.println(a);
	}
}