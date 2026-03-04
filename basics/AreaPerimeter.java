import java.io.*;
import java.util.*;
class AreaPerimeter
{
  double l;
  double b;
  void main()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter length value: ");
   l=sc.nextDouble();
   System.out.println("Enter breadth value: ");
   b=sc.nextDouble();
   }
   double calarea()
   {
    return l * b;
    }
    double calperimeter()
    {
     return 2 * (l + b);
     }
public static void main(String args[])
{
 AreaPerimeter R=new AreaPerimeter();
 R.main();
 System.out.println("Area : " + R.calarea());
 System.out.println("Perimeter : " + R.calperimeter());
}
}