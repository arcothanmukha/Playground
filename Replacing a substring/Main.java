import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sn = new Scanner(System.in);
      String str1 = sn.nextLine();
      String str2 = sn.nextLine();
      String str3 = sn.nextLine();
      String str4=str1.replace(str2,str3);
      System.out.println(str4);
    }
}