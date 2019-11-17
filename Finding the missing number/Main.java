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
      Arrays.sort(arr);
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=i+1)
        {
          System.out.println(i+1);
          break;
        }
      }
    }
}