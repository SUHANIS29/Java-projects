import java.util.Scanner;
class stringclass{
  public static void main(String[]args){
    String str="Suhani";
    String str2=new String ("Suhani");
    int l=str.length();
    System.out.println(l);
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());
    //to compare strings;
    if(str==str2){    //unequal as it checks stored location
      System.out.println("equal");
    }     
    else{
      System.out.println("unequal");
    }
    //answer eq bcoz checks values 
    if(str.equals(str2)){
      System.out.println("eq");
    }
    else{
     System.out.println("uneq");
    }
  }
}
