import java.util.*;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sn.nextInt();
      int k = sn.nextInt();
      Arrays.sort(arr);
      System.out.println(arr[n-k]);
    }   
}