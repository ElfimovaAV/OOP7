package ru.gb.lesson7;

import java.util.Scanner;

public class ViewCalculator {

    public void run() {
        while (true) {
            try {
                int arg = promptInt("Введите первый аргумент: ");
                Calculable calculator = new Calculator(arg);
                Decorator loggCalculator = new Decorator(calculator);
                while (true) {
                    String message = prompt("Введите команду (*, +, /, =) : ");
                    if (message.equals("*")) {
                        int num = promptInt("Введите второй аргумент: ");
                        loggCalculator.multiplication(num);
                        continue;
                    }
                    if (message.equals("+")) {
                        int num = promptInt("Введите второй аргумент: ");
                        loggCalculator.sum(num);
                        continue;
                    }
                    if (message.equals("/")) {
                        int num = promptInt("Введите второй аргумент: ");
                        loggCalculator.division(num);
                        continue;
                    }
                    if (message.equals("=")) {
                        int result = loggCalculator.getResult();
                        System.out.printf("Результат %d\n", result);
                        break;
                    }
                }
                String message = prompt("Хотите продолжить? (Y/N)?");
                if (message.equals("Y")) {
                    continue;
                }
                break;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

}

