import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sn = new Scanner(System.in);
      String str1 = sn.nextLine();
      String str2 = sn.nextLine();
      String str3 = str1+str1;
      if(str3.contains(str2))
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
}