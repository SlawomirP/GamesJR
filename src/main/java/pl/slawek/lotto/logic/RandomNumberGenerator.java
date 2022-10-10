package pl.slawek.lotto.logic;

import pl.slawek.lotto.configuration.LottoConfiguration;

import java.util.Random;

public class RandomNumberGenerator {
    private final Random RANDOM = new Random();

    public int inputRandomNumber() {
        return RANDOM.nextInt(LottoConfiguration.LOWER_BOUND, LottoConfiguration.UPPER_BOUND + 1);
    }
}
