package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int x, int y) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                result++;
            }
        }
        return result;
    }
}
