import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int count=1;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=n;i>=1;i--)
      {
        for(int j=1;j<=n;j++)
        {
          if(i==j)
            System.out.print("*");
          else if(j==count)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println("");
        count++;
	}
}
}