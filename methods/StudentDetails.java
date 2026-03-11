import java.util.*;
class StudentDetails
{
  String name;
  int age;
  void read()
  {
    System.out.println("Student name: ");
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    System.out.println("student age:");
    age=sc.nextInt();
  }
  void display()
  { 
     System.out.println(name);
     System.out.println(age);
  }
   public static void main(String args[])
   {
     StudentDetails s=new StudentDetails();
     s.read();
     s.display();
    
   }
}