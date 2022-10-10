package pl.slawek.lotto.logic;

import pl.slawek.lotto.configuration.LottoConfiguration;

import java.util.HashSet;

import static pl.slawek.lotto.logic.RandomNumberGenerator.inputNumber;

public class RandomSetCreator {

    private HashSet<Integer> set;

    public RandomSetCreator() {
        this.set = new HashSet<>();
    }

    public HashSet<Integer> getRandomNumbersSet() {
        while (this.set.size() != LottoConfiguration.LIMIT) {
            this.set.add(inputNumber());
        }
        return this.set;
    }
}
