import java.util.*;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sn = new Scanner(System.in);
      String str1 = sn.nextLine();
      String str2 = sn.nextLine();
      int no_of_parts = sn.nextInt();
      char[] arr = str2.toCharArray();
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==' ')
          System.out.println();
        else
          System.out.print(arr[i]);
      }
    }
}