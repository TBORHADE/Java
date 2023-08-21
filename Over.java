class Over
{
    public void c1() 
    {
        System.out.println("No arg");
    }
    public void c1(int i) 
    {
        System.out.println("int");
    }
    public void c1(double d) 
    {
        System.out.println("double");
    }
    public static void main(String args[])
    {
        Over o = new Over();
        o.c1();
        o.c1(10);
        o.c1(10.5);
    }
}



