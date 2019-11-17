import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sn = new Scanner(System.in);
      int n=sn.nextInt();
      int m=sn.nextInt();
      if(n>m)
        System.out.println("num1 is the greatest number");
      else if(m>n)
        System.out.println("num2 is the greatest number");
	}
}