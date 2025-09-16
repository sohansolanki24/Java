// example of abstract keyword
abstract class demo                 //abstract keyword is compulsery while define class
{
    void display()
    {
        System.out.println("from abstract class");
    }
    abstract void car();             //abstract method
}
class B extends demo
{
    void car()
    {
        System.out.println("driving...");
    }
}
class absCall
{
    public static void main(String args[])
    {
        B ob=new B();       // u can not craete an object of abstract class u must have an extends class of abstract class
        ob.car();
        ob.display();
    }
}