import java.util.Scanner;
class Main{
	
      public static int max_num(int a,int b)
  {
    int max=0;
    if(a>b)
    {
      max=a;
    }
    else
    {
      max=b;
    }
    return max;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int max1=max_num(n1,n2);
      int max2=max_num(max1,n3);
      System.out.print(max2);
	}
}