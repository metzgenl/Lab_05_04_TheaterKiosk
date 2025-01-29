//Import Scanner
import java.util.Scanner;

public class TheaterKiosk {
    int userAge = 0;
    int kioskAge = 21;
    String incorrectInput = "";
    public void getKioskAge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");

        //Check for valid input from user
        if (in.hasNextInt()){
            userAge = in.nextInt();
            in.nextLine();

            // Calculate the Shipping Price and Total Price
            if (userAge >= kioskAge){
                System.out.println("You get a wrist band!");
            }
        }
        else{
            incorrectInput = in.nextLine();
            System.out.println("\n" + incorrectInput + " is not a valid entry. Run the program again and enter a valid age!");
        }


    }
}
