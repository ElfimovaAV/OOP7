package ru.gb.lesson7;

public interface Calculable {
    Calculable sum(int num);
    Calculable multiplication(int num);
    Calculable division(int num);
    int getResult();
}
