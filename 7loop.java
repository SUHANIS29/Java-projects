import java.util.Scanner;
class loop{
  public static void main(String [] args){
    int i,n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a number\n");
    n=s.nextInt();
    for(i=0;i<n;i++)
    {
      System.out.println(i);
    }
  }
}
