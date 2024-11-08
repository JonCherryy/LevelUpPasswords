
import java.util.Scanner;

public class PasswordDemo {

    public static void main(String[] args) {

        Password password = new Password();
        password.displayConditions();

        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        password.validate(userInput);

        input.close();    
    }
    
}
