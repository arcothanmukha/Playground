import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int sum=0,k=0;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      sum=n%10;
      while(n>0)
      {
        k=n%10;
        n=n/10;
      }
      sum=sum+k;
      System.out.println(sum);
	}
}