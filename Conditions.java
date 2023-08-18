import java.util.Scanner;

public class Conditions {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a == b) {
            System.out.println("A equal to B");
        }else if(a > b) {
            System.out.println("A greater than B");
        }else if(a < b) {
            System.out.println("A lesser than B");
        }
    }
}