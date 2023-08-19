import java.util.*;

public class Array {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //int[] marks = new int[3];
        // int marks[] = new int[3];

        // int marks[] = {97,98,95};
        // marks[0] = 97; //physics
        // marks[1] = 98; //chem
        // marks[2] = 95;//english
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();//for loop input   
         }
        
        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);// output5
            

        }
    }
}

