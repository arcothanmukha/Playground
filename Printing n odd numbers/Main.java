import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int count=1;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=1;count<=n;i=i+2)
      {
        System.out.println(i);
        count++;
      }
	}
}