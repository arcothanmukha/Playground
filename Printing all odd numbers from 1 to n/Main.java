import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=1;i<=n;i=i+2)
        System.out.println(i);
	}
}