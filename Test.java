abstract class Vehicle
{
    public abstract int getNoofwheels();
} 
class Bus extends Vehicle
{
    public int getNoofwheels()
    {
        return 6;
    }
}
class Auto extends Vehicle
{
    public int getNoofwheels()
    {
        return 3;
    }
}
class Test
{
    public static void main(String args[])
    {
        Bus b = new Bus();
        System.out.println(b.getNoofwheels());

        Auto a = new Auto();
        System.out.println(a.getNoofwheels());
        
    }
}