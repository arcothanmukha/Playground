import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sn = new Scanner(System.in);
    String str = sn.nextLine();
    int k = sn.nextInt();
   if(str.charAt(0)=='H')
     System.out.println("All is well");
    else
      System.out.println("I am waiting");
  }
}