package Geeks.functions;

public class Cloning {
}

class Test2 implements Cloneable
{
    int a;

    Test2 cloning()
    {
        try
        {
            return (Test2) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}

class demo
{

    public static void main(String args[])
    {
        Test2 obj1 = new Test2();
        Test2 obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}