import java.util.Scanner;

public class Main {
    public static void main (String[]agrs){
        System.out.println("Enter your number");
        Scanner sc= new Scanner (System.in);
        
        Float Marks = sc.nextFloat();
        
        if (Marks >= 90){
            System.out.println("Grade A");
            
        } else if (Marks >=70){
            System.out.println("Grade A");
            
        } else if (Marks >=50){
            System.out.println("Grade C");
            
        } else {
            System.out.println(" Fail");
        }
        
    }
}