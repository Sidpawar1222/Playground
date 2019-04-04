import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int odd=1;
      for(int count=1;count<=n;count=count+1)
      {
        if(odd%2 !=0)
        {
          System.out.println(odd);
          odd=odd+1;
        }
        odd=odd+1;
      }
      
	}
}