import java.util.*;
class Access
{
   int var=10;
   public int publicvar=20;
   private int privatevar=30;
   protected int protectedvar=40;
   void display()
   {
      System.out.println("Default modifier :"+var); 
      System.out.println("Public modifier :"+publicvar); 
      System.out.println("Private modifier :"+privatevar); 
      System.out.println("Protected modifier :"+protectedvar); 

   }
}
class AccessControl
{
   public static void main(String args[])
   {
     Access obj=new Access();
     System.out.println("Default modifier :"+obj.var); 
     System.out.println("Public modifier :"+obj.publicvar); 
     //System.out.println("Private modifier :"+obj.privatevar); 
     System.out.println("Protected modifier :"+obj.protectedvar); 
     obj.display();

    }
}