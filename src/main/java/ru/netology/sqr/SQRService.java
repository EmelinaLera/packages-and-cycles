package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int minLimit, int maxLimit) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if ((i * i >= minLimit) & (i * i <= maxLimit)) {
                result++;
            }
        }
        return result;
    }
}
