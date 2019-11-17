import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      int count=0;
       Scanner sn = new Scanner(System.in);
    int n = sn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i]=sn.nextInt();
     for(int i=0;i<n;i++)
     {
       if(a[i]==0)
         count+=1;
       if(a[i]>0)
         System.out.print(a[i]+" ");
     }
      for(int i=0;i<count;i++)
        System.out.print("0"+" ");
    }
}