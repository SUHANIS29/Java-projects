import java.util.Scanner;
class even{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number:");
    n=s.nextInt();
    while(n>0){
    if(n%2==0){
      System.out.println("number is even");
    }
    else{
     System.out.println("number is odd");
    }
  }
}
}
