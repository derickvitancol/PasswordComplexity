package com.passwordchecker.chain;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.OptionalInt;

public class UpperCaseCheck extends Chain{

    public UpperCaseCheck(Chain next)
    {
        super(next);
    }

    @Override
    public int check(String password)
    {
        int result = 0;
        OptionalInt streamResult;

        streamResult = password.chars().
                filter(character ->  character >= 65 && character <= 90).
                findAny();
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
