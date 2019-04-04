import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int val=1;
      int i=1;
      while(i<=exp)
      {
        val=val*base;
        i+=1;
      }
      System.out.println(val);
    }
}