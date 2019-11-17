import java.util.Scanner;
class Main {
   public static int natural(int n)
   {
     int sum=0;
     if(n==0)
       return sum;
     else
       sum=n+natural(n-1);
     return sum;
   }
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int sum = natural(n);
      System.out.println(sum);
    }
}