class P {
    public void c1() 
    {
        System.out.println("Parent");
    }
}

class C extends P {
    public void c2() 
    {
        System.out.println("Child");
    }
}

public class Retest {
    public static void main(String args[])
    {
        C c = new C();
        c.c1();
        c.c2();
    }
}
