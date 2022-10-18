package pl.slawek.lotto.logic;

import pl.slawek.lotto.configuration.LottoConfiguration;

import java.util.HashSet;


public class RandomNumbersSet implements NumberGenerable {
    RandomNumberGenerator randomNumber = new RandomNumberGenerator();

    @Override
    public HashSet<Integer> getRandomNumbersSet() {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() != LottoConfiguration.LIMIT) {
            set.add(randomNumber.inputRandomNumber());
        }
        return set;
    }

}
