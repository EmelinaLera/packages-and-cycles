package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        int x = 10;
        int y = 99;
        int i;
        for (i = 0; i < 10; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                result++;
            }


        }
        System.out.println("Количество квадратов " + result);
    }


}
