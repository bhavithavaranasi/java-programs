class single
{
  void display()
  {
    System.out.println("Parent class "); 
  }
}
class SingleInheri extends single
{
  void say()
  {
    System.out.println("Child class");
  }
public static void main(String args[])
{ 
   SingleInheri s=new SingleInheri();
   s.display();
   s.say();
}
}