package com.passwordchecker;

import com.passwordchecker.chain.*;


public class PasswordChecker {
    private Chain checkers = new LengthCheck(
            new UpperCaseCheck(
                    new SpecialCharacterCheck(
                            new ContainsNumberCheck(null))));
    public int checkStrength(String password)
    {
        int result = 0;
        result = checkers.check(password);
        return result;
    }
}
