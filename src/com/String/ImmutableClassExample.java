package com.String;

public final class ImmutableClassExample {
    private final int i;

    public ImmutableClassExample(int i) {
        this.i = i;
    }

    public ImmutableClassExample modify(int i) {
        if (this.i == i) {
            return this;
        } else {
            return new ImmutableClassExample(i);
        }
    }

    public int getValue() {
        return i;
    }
    public static void main(String[] args) {
        ImmutableClassExample a1 = new ImmutableClassExample(10);
        ImmutableClassExample a2 = a1.modify(100);
        ImmutableClassExample a3 = a1.modify(10);
        System.out.println(a1==a2);
        System.out.println(a1==a3);
    }
}
