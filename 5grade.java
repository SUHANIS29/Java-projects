//marks 
import java.util.Scanner;
class marks{
  public static void main(String[]args){
    int marks;
    Scanner s=new Scanner(System.in);
    System.out.println("enter your marks:");
    marks=s.nextInt();
  if(marks>=75){
    System.out.println("Grade A");
  }
  else if(marks>=50 && marks<75){
    System.out.println("Grade B");
  }
  else if(marks>=35 && marks<50){
    System.out.println("Grade C");
  }
  else{
    System.out.print("failed");
  }
  }
}
