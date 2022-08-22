package pl.slawek.lotto.logic;

import java.util.HashSet;

import static pl.slawek.lotto.logic.RandomNumberGenerator.inputNumber;

public class RandomSetCreator {
    private final static int LIMIT = 6;
    private final static int LOWER_BOUND = 1;
    private final static int UPPER_BOUND = 99;

    private HashSet<Integer> set;

    public RandomSetCreator() {
        this.set = new HashSet<>();
    }

    public HashSet<Integer> getRandomNumbersSet() {
        while (this.set.size() != LIMIT) {
            this.set.add(inputNumber(LOWER_BOUND, UPPER_BOUND));
        }
        return this.set;
    }

}
