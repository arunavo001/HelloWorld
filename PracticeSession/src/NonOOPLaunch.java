import java.util.Scanner;
public class NonOOPLaunch
{
    
}
class Rectangle
{
    float area;
    float length;
    float breadth;
    public void accInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the length : ");
        length = sc.nextFloat();
        System.out.println("Enter the value of the breadth : ");
        breadth=sc.nextFloat();
    }
    public void compute()
    {
        area=length*breadth;
    }
    public void display()
    {
        System.out.println("The area of the rectangle is : "+area);
    }
}
class Square
{
    float area;
    float length;
    public void accInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the length : ");
        length = sc.nextFloat();
    }
    public void compute()
    {
        area=length*length;
    }
    public void display()
    {
        System.out.println("The area of the square is : "+area);
    }
}
class Circle
{
    float area;
    int radius;
    static float pi=3.14f;
    public void accInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the length : ");
        radius = sc.nextInt();
    }
    public void compute()
    {
        area=pi*radius*radius;
    }
    public void display()
    {
        System.out.println("The area of the radius is : "+area);
    }
}