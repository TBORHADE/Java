import java.util.*;

public class Adult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("Person is Adult");
        } else {
            System.out.println("Person is minor");
        }
    }

}