package pl.slawek.lotto.logic;

import pl.slawek.lotto.configuration.LottoConfiguration;

public class IsInBounds {

    public static boolean isInBounds(int number) {
        return number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND;
    }
}
