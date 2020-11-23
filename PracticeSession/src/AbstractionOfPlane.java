public class AbstractionOfPlane
{
    public static void main(String[] args)
    {
        plane p1=new CargoPlane();
        plane p2=new PassengerPlane();
        p1.fly();
        p1.takeOff();
        p1.land();
        p2.fly();
        p2.takeOff();
        p2.land();
    }
}
abstract class plane
{
    abstract void fly();
    abstract void takeOff();
    abstract void land();
}
class CargoPlane extends plane
{
    public void fly()
    {
        System.out.println("Cargo plane fly in medium");
    }
    public void takeOff()
    {
        System.out.println("It takeoff in medium wat");
    }
    public void land()
    {
        System.out.println("it land in medium speed");
    }
}
class PassengerPlane extends plane
{
    public void fly()
    {
        System.out.println("passenger plane fly in medium");
    }
    public void takeOff()
    {
        System.out.println("It takeoff in medium wat");
    }
    public void land()
    {
        System.out.println("it land in medium speed");
    }
}
