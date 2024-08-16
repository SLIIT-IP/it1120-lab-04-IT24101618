
import java.util.Scanner;

public class IT24101618Lab4Q1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        

        double number;


        System.out.println("Enter the number: ");
        number = scanner.nextDouble();

 
	if(number <'0'){
	System.out.println("The number is negative");
	}
	else if(number >'0'){
	System.out.println("The number is : positive");
	}

	else{
	System.out.println("The number is zero");
	}

 
        
        
        scanner.close();
    }
}