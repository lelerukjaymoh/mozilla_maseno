 import java.util.Scanner;
  public class git{
    public static void main(String []args){

       String username,email;
      System.out.print("\n\n************MY FIRST PROGRAM IN GIT**************");
      System.out.print("\n\n   WELCOME TO GIT !!!\n");
      System.out.print("\nEnter your USERNAME and EMAIL to signup for GITHUB");
      System.out.print("\nusername: ");
      Scanner one = new Scanner(System.in);
      username = one.nextLine();
      System.out.print("\nemail: ");
      Scanner two = new Scanner(System.in);
      email = two.nextLine();
      System.out.println(" \n\n           YOU HAVE SUCCESSULLY SET UP A GITHUB ACCOUNT         \n\n"); 
    }
  }
