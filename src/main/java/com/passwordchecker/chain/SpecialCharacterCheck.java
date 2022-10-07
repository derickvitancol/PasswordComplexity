package com.passwordchecker.chain;

import java.util.OptionalInt;

public class SpecialCharacterCheck extends Chain{

    public SpecialCharacterCheck(Chain next)
    {
        super(next);
    }

    @Override
    public int check(String password)
    {
        int result = 0;
        OptionalInt streamResult;
        streamResult = password.chars()
                .filter(character -> (character >= 21 && character <= 47)
                        || (character >= 58 && character <= 64))
                .findAny();
        if(streamResult.isPresent())
        {
            result = 1;
        }
        if(this.getNext() == null)
        {
            return result;
        }
        else
        {
            return result + super.getNext().check(password);
        }
    }
}
