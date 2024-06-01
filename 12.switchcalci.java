import java.util.Scanner;
class calculator{
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    int a,b,c,o;
    System.out.println("enter 2 numbers:");
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("enter a operation no.");
    o=s.nextInt();
    switch(o){
      case 1:
      c=a+b;
      System.out.println("addition:"+c);
      break;
      case 2:
      c=a-b;
      System.out.println("subtraction:"+c);
      break;
      case 3:
      c=a*b;
      System.out.println("multiplication:"+c);
      break;
    }
  }
}
