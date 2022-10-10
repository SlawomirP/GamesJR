package pl.slawek.lotto.logic;

import pl.slawek.lotto.configuration.LottoConfiguration;

import java.util.Random;

public class RandomNumberGenerator {
    private final static Random RANDOM = new Random();

    public static int inputNumber() {
        return RANDOM.nextInt(LottoConfiguration.LOWER_BOUND, LottoConfiguration.UPPER_BOUND + 1);
    }
}
