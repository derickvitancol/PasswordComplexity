package com.passwordchecker.chain;

public class LengthCheck extends Chain{

    public LengthCheck(Chain next)
    {
        super(next);
    }
    @Override
    public int check(String password)
    {
        int result = 0;
        if(password.length() >= 8) result = 1;

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
