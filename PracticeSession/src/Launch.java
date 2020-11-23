class ClassA
{
    public void disp()
    {
        System.out.println("Class:A");
    }
}
interface InterfaceB
{
    public void show();
}
interface InterfaceC
{
    public void show();
}
public class Launch extends ClassA implements InterfaceB,InterfaceC {
    public void show() {
        System.out.println("show method implementation");
    }

    public void disp() {
        System.out.println("disp method of Launch");
    }

    public static void main(String args[]) {
        Launch d = new Launch();
        d.disp();
        d.show();
    }
}
