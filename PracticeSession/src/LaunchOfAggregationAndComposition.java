public class LaunchOfAggregationAndComposition
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.getInfo();// performing inheritance
        System.out.println("Human(student's) heart rate is :"+s.obj1.getHeartRate());
        System.out.println("Human(Student's) brain colour is : "+s.obj2.getColour());
        Bike c=new Bike("Apache RTR");
        s.hasAOfBike(c);
        System.out.println("------Has-A relationship--------");
        s.getInfoOfStudent();
        System.out.println("Name of the brand of bike which has bought :"+c.getBrand());
        Book b=new Book(200);
        s.hasAOfBook(b);
        System.out.println("No of pages in book which student is reading : "+b.getNoOfPages());
        s=null;
        System.out.println("..............After affecting.............");
        if(s==null)
        {
            System.out.println("No of pages in book which student is reading still : "+b.getNoOfPages());
            System.out.println("Name of the brand of bike which has bought :"+c.getBrand());
        }
        System.out.println("Student's heart and brain is not working so student has died but his book and bike are still there to use");
    }
}
class Human
{
    Heart obj1=new Heart(92.35f);
    Brain obj2=new Brain("Grey");
    public void getInfo()
    {
        System.out.println("Student is a human and it comes under IS-A relationship");
    }
}
class Heart
{
    private float heartRate;
    public Heart(float heartRate)
    {
        this.heartRate=heartRate;
    }
    public float getHeartRate()
    {
        return heartRate;
    }
}
class Brain
{
    private String colour;
    public Brain(String colour)
    {
        this.colour=colour;
    }
    public String getColour()
    {
        return colour;
    }
}
class Student extends Human
{
    void hasAOfBike(Bike bike)
    {
        bike.getBrand();
    }
    void hasAOfBook(Book book)
    {
        book.getNoOfPages();
    }
    void getInfoOfStudent()
    {
        System.out.println("From there Has A relationship is becoming started ");
    }
}
class Bike
{
    private String brand;
    public Bike(String brand)
    {
        this.brand=brand;
    }
    public String getBrand()
    {
        return brand;
    }
}
class Book
{
    private int NoOfPages;
    public Book(int NoOfPages)
    {
        this.NoOfPages=NoOfPages;
    }
    public int getNoOfPages()
    {
        return NoOfPages;
    }
}