import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int sum=0;
      Scanner sn = new Scanner(System.in);
      int n=sn.nextInt();
      sum=sum+n%10;
      n=n/10;
      sum=sum+n;
      System.out.println(sum);
	}
}