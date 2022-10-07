import static org.junit.Assert.assertEquals;


import com.passwordchecker.PasswordChecker;
import org.junit.Test;
public class PasswordComplexity {

    @Test
    public void Assert_PasswordStrong()
    {
        PasswordChecker checker = new PasswordChecker();
        assertEquals(checker.checkStrength("abc123"),1);
        assertEquals(checker.checkStrength("abc!"),1);
        assertEquals(checker.checkStrength("Abc"),1);
        assertEquals(checker.checkStrength("Abcdefgh!"),3);
        assertEquals(checker.checkStrength("Abcdefgh!4444"),4);
    }

}
