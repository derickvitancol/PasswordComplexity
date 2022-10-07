package com.passwordchecker.chain;

public abstract class Chain {
    private Chain next;
    public Chain(Chain next)
    {
        this.next = next;
    }

    protected Chain getNext()
    {
        return this.next;
    }
    public abstract int check(String password);
}
