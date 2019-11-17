import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int max=0;
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
       {
        a[i]=sn.nextInt();
        if(a[i]>max)
          max=a[i];
      }
      System.out.println(max);
    }
}