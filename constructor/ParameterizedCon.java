class ParameterizedCon
{
  int age;
  String name;
  ParameterizedCon(int a,String b)
  {
    age=a;
    name=b;
  }
  public static void main(String args[])
  {
    ParameterizedCon obj=new ParameterizedCon(19,"Bhavi");
    System.out.println("age: "+obj.age+"name:"+obj.name);
  }
}