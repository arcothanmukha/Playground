import java.util.*;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int k = sn.nextInt();
      int[] arr = new int[n];
      int[] b = new int[k];
      Arrays.fill(b,0);
      for(int i=0;i<n;i++)
        arr[i]=sn.nextInt();
      for(int i=0;i<n;i++)
        b[arr[i]-1]++;
      for(int i=0;i<k;i++)
        System.out.println(i+1+" "+b[i]);
    }
}