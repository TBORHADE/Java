class P 
{
    public void property()
    {
        System.out.println("Gold");
    }

    public void marry() 
    {
        System.out.println("X");
    }
}

class C extends P
 {
    // Override
    public void marry() 
    {
        System.out.println("Q");
    }
}

public class Ov
{
    public static void main(String args[]) 
    {
        P p = new C(); // Create an instance of C, but reference it with P type
        p.marry();     // Calls the overridden marry() method in C
    }
}
