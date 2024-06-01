import java.util.Scanner;
import java.util.Arrays;
class element{
  public static void main(String[]args){
    int n;
    int a[]=new int[6];
    Scanner s=new Scanner(System.in);
    System.out.println("enter size of array:");
    n=s.nextInt();
    System.out.println("enter elements:");
    for(int i=0;i<n;i++){
      a[i]=s.nextInt();
    }
    Arrays.sort(a);
    System.out.println("sorted array is:");
    for(int b:a){ //for(int i=0;i<n;i++){
                  // System.out.println(a[i]+"");
      System.out.println(b+"");
    }
  }
}
