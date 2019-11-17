import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int sum=1;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=2;i<=n;i++)
        sum=sum*i;
      System.out.println(sum);
	}
}