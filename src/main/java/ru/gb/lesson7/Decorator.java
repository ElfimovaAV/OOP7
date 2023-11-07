package ru.gb.lesson7;

public class Decorator implements Calculable{

    protected Calculable calc;
    Loggable logger = new Logger();


    public Decorator(Calculable calc) {
        logger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public Calculable sum(int num) {
        logger.saveLog(calc.getResult() + " + " + num);
        return this.calc.sum(num);
    }

    @Override
    public Calculable multiplication(int num) {
        logger.saveLog(calc.getResult() + " * " + num);
        return this.calc.multiplication(num);
    }

    @Override
    public Calculable division(int num) {
        logger.saveLog(calc.getResult() + " / " + num);
        return this.calc.division(num);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        logger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}