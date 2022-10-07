package com.passwordchecker.chain;

import java.util.OptionalInt;

public class ContainsNumberCheck extends Chain{
    public ContainsNumberCheck(Chain next)
    {
        super(next);
    }

    @Override
    public int check(String password)
    {
        int result = 0;
        OptionalInt streamResult;
        streamResult = password.chars()
                .filter(character -> character >= 48 && character <= 57)
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
