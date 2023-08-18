import java.util.*;
import bank;

class Shape {
    public void area() {
        System.out.println("Display area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
// class EquilateralTriangle extends Triangle {
//     print void area(int l, int h) {
//     System.out.println(1/2*l*h);    
//     }
// }

class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Geometry {

    public static void main(String args[]) {
       bank.Account account1 = new bank.Account();
       account1.name = "Customer1";
    // Triangle t1 = new Triangle();
    // t1.color = "red";
    }
}