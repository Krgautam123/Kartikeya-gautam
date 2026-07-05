/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    System.out.println("Enter your Number");
	    
		Scanner sc= new Scanner (System.in);
		
		int n = sc.nextInt();
		switch(n){
		    case 1 : System.out.println("Monday");
		    break;
		    case 2 : System.out.println("Tuesday");
		    break;
		    case 3 : System.out.println("Wednesday");
		    break;
		    case 4 : System.out.println("Thursday");
		    break;
		    case 5 : System.out.println("Friday");
		    break;
		    case 6 : System.out.println("Saturday");
		    break; 
		    default:System.out.println("Sonday");
		}
	}
}
