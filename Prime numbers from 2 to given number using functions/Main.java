import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int count=0;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      for(int i=2;i<=n;i++)
      {
        count=0;
        for(int j=2;j*j<=i;j++)
        {
          if(i%j==0)
          {
            count+=1;
            break;
          }
        }
        if(count==0)
          System.out.println(i);
      }      
	}
}