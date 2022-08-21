package pl.slawek.lotto.logic;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random = new Random();

    int inputNumber(int lowerBound, int upperBound){
    return random.nextInt(lowerBound,upperBound +1);
    }
}
