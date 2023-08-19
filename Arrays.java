// Q. Tanke an array as i/p from user. Search for a given number x and print the index at whicj it occurs
import java.util.*;

public class Arrays {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

    

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();//for loop input   
         }
        
        int x = sc.nextInt();

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at index: " + i);// output5
            }

        }
    }
}

