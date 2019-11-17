import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    String str1 = sn.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder temp = new StringBuilder();
    for(int i=0;i<str1.length();i++)
     {
      for(int j=0;j<str.length();j++)
      {
        if(str1.charAt(i)==sb.charAt(j))
        {
          sb.setCharAt(j,'$');
        }
      }
    }
    for(int i=0;i<str.length();i++)
      if(sb.charAt(i)!='$')
        temp.append(sb.charAt(i));
    System.out.print(temp);
  }
}