package pl.slawek.lotto.logic;

import java.util.Random;

public class RandomNumberGenerator {
    private final static Random RANDOM = new Random();

    public static int inputNumber(int lowerBound, int upperBound) {
        return RANDOM.nextInt(lowerBound, upperBound + 1);
    }
}
