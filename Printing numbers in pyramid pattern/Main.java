import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int count=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=i;j<n;j++)
          System.out.print(" ");
        for(int j=1;j<=i;j++)
        {
          System.out.print(count+" ");
          count+=1;
        }
        System.out.println("");
      }
    }    
}