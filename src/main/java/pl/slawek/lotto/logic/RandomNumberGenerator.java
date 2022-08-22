package pl.slawek.lotto.logic;

import java.util.Random;

public class RandomNumberGenerator {
    private static Random random = new Random();

    public static int inputNumber(int lowerBound, int upperBound) {
        return random.nextInt(lowerBound, upperBound + 1);
    }
}
