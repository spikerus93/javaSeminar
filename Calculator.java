/*
Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами
и возвращать результат. В классе должен быть метод calculate, который принимает оператор и значения аргументов
и возвращает результат вычислений.
При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор:
'оператор'".
*/
public class Calculator {
    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+': {
                return a + b;
            }
            case '-': {
                return a - b;
            }
            case '*': {
                return a * b;
            }
            case '/': {
                return a / b;
            }
        }
        System.out.println("Некорректный оператор: " + op);
        return 0;
    }
}