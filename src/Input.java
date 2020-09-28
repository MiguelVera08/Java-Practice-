import java.util.Scanner;

public class Input {
    public static void main(String [] args){

        //Create Scanner object
        Scanner input = new Scanner(System.in);

//        //Ask user for input
//        System.out.println("Enter a line of text: ");
//        String line = input.nextLine();
//
//        //Display the input user has typed.
//        System.out.println("Here is what you entered: " + line);

        //Ask user for a number
        System.out.println("Enter a number: ");

        int value = input.nextInt();

        System.out.println("Number entered: " + value);
    }
}
