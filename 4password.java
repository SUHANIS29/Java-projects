import java.util.Scanner;
class IF{
  public static void main(String[] args){
    int password;
    System.out.println("enter password:");
    Scanner s=new Scanner(System.in);
    password=s.nextInt();
    if(password==1234){

      System.out.print("matched");
    }
    else
    {
      System.out.print("not matched");
    }
  }
}
