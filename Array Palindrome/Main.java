import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int count=0;
      Scanner sn = new Scanner(System.in);
      int arr_size = sn.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=sn.nextInt();
      for(int i=0,j=arr_size-1;i<j;i++,j--)
      {
        if(arr[i]!=arr[j])
        {
          System.out.println("No");
          count+=1;
          break;
        }
      }
      if(count==0)
        System.out.println("Yes");
    }
}