import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sn = new Scanner(System.in);
      char ch = sn.next().charAt(0);
      int n = sn.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        char add = (char) (ch-n);
          if(add<'a')
          {
            add=(char)(add+26);
            System.out.println(add);
          }
          else
            System.out.println(add);
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        char add = (char) (ch-n);
          if(add<'A')
          {
            add=(char)(add+26);
            System.out.println(add);
          }
        else
          System.out.println(add);
      }
            
    }
}