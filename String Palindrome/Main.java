import java.util.Scanner; class Main{ public static void main(String args[]) { // Type your code here
  Scanner sn = new Scanner(System.in); String str = sn.nextLine(); int j = str.length()-1; int count=0; for(int i=0,n=j; i<n; i++,n--) { if(str.charAt(i)!=str.charAt(n)) { count+=1; System.out.println("No"); break; } } if(count==0) System.out.println("Yes"); } }