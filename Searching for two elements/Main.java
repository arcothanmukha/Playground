import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sn = new Scanner(System.in);
      int size = sn.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
        arr[i]=sn.nextInt();
      int n = sn.nextInt();
      int k = sn.nextInt();
      int count=0,count1=0,index=-1,index1=-1;
      for(int i=0;i<size;i++)
      {
        if(arr[i]==n)
         {
          count++;
          index=i;
        }
        else if(arr[i]==k)
           {
          count1++;
          index1=i;
        }
      }
      if(count!=0)
        System.out.println(index);
      else
        System.out.println(index);
      if(count1!=0)
        System.out.println(index1);
      else
        System.out.println(index1);
    }
}