import java.util.Scanner;
class largest{
  public static void main(String [] args){
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter value of a,b,c");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if(a>b){
      if(a>c)
      {
        System.out.println("greater is :"+a);
      }
      else
      {
        System.out.println("greater is: "+c);
      }

    }
    else{
      if(b>c)
      {
        System.out.println("greater is "+b);
      }
      else{
        System.out.print("greater is "+c);
      }
    }
  }
}
