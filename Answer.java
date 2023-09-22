class Answer {
/*
Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое
треугольное число.
Пример
n = 4 -> 10
n = 5 -> 15
*/
/*  public int countNTriangle(int n) {
        return n * (n + 1) / 2;
    }*/
/*
Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.
*/
    public void printPrimeNums() {
        for(int i = 1; i <= 1000; i++) {
            boolean k = false;
            for(int j = 2; j * j <= i; j++) {
                k = (i % j == 0);
                if(k) break;
            }
            if (!k) System.out.println(i);
        }
        return;
    }
}