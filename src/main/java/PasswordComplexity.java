import java.util.Scanner;

import com.passwordchecker.PasswordChecker;

public class PasswordComplexity {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input password: ");
        String password = userInput.nextLine();

        PasswordChecker checker = new PasswordChecker();
        System.out.println("Password Strength: " + checker.checkStrength(password));
    }

}
