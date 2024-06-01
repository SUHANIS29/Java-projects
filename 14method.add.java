import java.util.Scanner;
class Methods{
public static void main(String [] args)
{
    System.out.println("enter two numbers: ");
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
int r= sum(a,b); //method calling
  System.out.println(r);
}
static int sum(int a,int b){  //method define
return a+b;
}  
}
