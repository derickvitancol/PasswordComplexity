import java.util.Scanner;

import com.passwordchecker.PasswordChecker;
import com.passwordchecker.input.file.FileInput;

public class PasswordComplexity {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input password: ");
        String password = userInput.nextLine();

        PasswordChecker checker = new PasswordChecker();
        System.out.println("Password Strength: " + checker.checkStrength(password));

        FileInput fileInput = new FileInput();
        fileInput.setPasswordFile("D:\\Java Practices\\PasswordComplexity\\src\\main\\java\\com\\passwordchecker\\passwords.txt");
        fileInput.readFile().stream()
                .map(element -> "Password Strength: " + checker.checkStrength(element))
                .forEach(System.out::println);
    }

}
