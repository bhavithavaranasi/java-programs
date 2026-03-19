class Animal 
{
   void sound()
   {
       System.out.println("Animal makes sound");
    }
}
class dog extends Animal
{
  void sound()
  {
        System.out.println("dog barks");
  }
}
class OverRiding
{
  public static void main(String args[])
 {
  dog d= new dog();
  d.sound();
}
}