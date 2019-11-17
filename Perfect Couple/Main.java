import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        a[i]=sn.nextInt();
      int sum = sn.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(a[i]+a[j]==sum)
            System.out.println(a[i]+","+" "+a[j]);
        }
      }
    }
}