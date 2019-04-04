import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n+1;
      for(int rownum=1;rownum<=n;rownum++)
      {
        num=n-(rownum-1);
        for(int colnum=1;colnum<=(n-(rownum-1));colnum++)
        {
          System.out.print(num);
          num=num-1;
        }
        System.out.print("\n");
      }
	}
}