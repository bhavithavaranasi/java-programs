import java.io.*;
import java.util.*;
class Palindrome
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string: ");
   String str= sc.nextLine();
   String rev="";
   for(int i=str.length()-1;i>=0;i--)
   { 
     rev=rev+str.charAt(i);
    }
   if(str.equalsIgnoreCase(rev))
   { 
    System.out.println("it is a palindrome");
    }
    else
    {
     System.out.println("it is not a palindrome");
    }
  }
 
}