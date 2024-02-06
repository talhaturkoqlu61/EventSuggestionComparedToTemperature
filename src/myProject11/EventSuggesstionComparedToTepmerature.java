package myProject11;
import java.util.Scanner;

public class EventSuggesstionComparedToTepmerature {
	public static void main(String[]args) {
		double temperature;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a value of temperature:");
		temperature=input.nextDouble();
        if(temperature<5) {
        	System.out.println("You can go skiing");
        	
        }
        else if(temperature>=5&&temperature<15) {
        	System.out.println("You can go to a cinema");
        	
        }
        else if(temperature==15) {
        	System.out.println("You can go both picnic and cinema");
        	
        	
        }
        else if(temperature>15&&temperature<=25) {
        	System.out.println("You can go picnic");
        	
        }
        else {
        	System.out.println("You can swim");
        	
        }
	}

}
