public class AbstractionProblem
{
    public static void main(String[] args)
    {
        Bird bird=new GoldenEagle();
        bird.fly();
        bird.eat();
        Bird bird1=new SerpentEagle();
        bird1.fly();
        bird1.eat();
        Bird bird2=new VegSparrow();
        Bird bird3=new NonVegSparrow();
        bird2.fly();
        bird2.eat();
        bird3.fly();
        bird3.eat();
    }
}
abstract class Bird
{
    abstract void fly();
    abstract void eat();
    public Bird()
    {
        System.out.println("Abstract type parent class constructor Bird has called");
    }
}
abstract class Eagle extends Bird
{
    public Eagle()
    {
        System.out.println("Child class constructor Eagle has been called");
    }
    void fly()
    {
        System.out.println("Eagle fly in high speed");
    }
}
abstract class Sparrow extends Bird
{
    public Sparrow()
    {
        System.out.println("Child class constructor Sparrow has been called");
    }
    void fly()
    {
        System.out.println("Sparrow fly in medium speed");
    }
}
class GoldenEagle extends Eagle
{
    void eat()
    {
        System.out.println("Golden eagle eat fish");
    }
}
class SerpentEagle extends Eagle
{
    void eat()
    {
        System.out.println("Serpent eagle eat snake");
    }
}
class VegSparrow extends Sparrow
{
    void eat()
    {
        System.out.println("Veg sparrow eat veg");
    }
}
class NonVegSparrow extends Sparrow
{
    void eat()
    {
        System.out.println("Non veg sparrow  eat non veg");
    }
}

