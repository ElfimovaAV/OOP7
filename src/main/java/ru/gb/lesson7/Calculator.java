package ru.gb.lesson7;

public final class Calculator implements Calculable {

    private int arg;

    public Calculator(int arg) {
        this.arg = arg;
    }

    @Override
    public Calculable sum(int num) {
        arg += num;
        return this;
    }

    @Override
    public Calculable multiplication(int num) {
        arg *= num;
        return this;
    }

    @Override
    public Calculable division(int num) {
        arg /= num;
        return this;
    }

    @Override
    public int getResult() {
        return arg;
    }
}
