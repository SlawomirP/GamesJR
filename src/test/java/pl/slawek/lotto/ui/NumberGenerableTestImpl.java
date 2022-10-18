package pl.slawek.lotto.ui;

import java.util.HashSet;
import java.util.Set;
import pl.slawek.lotto.logic.NumberGenerable;

public class NumberGenerableTestImpl implements NumberGenerable {

    Set<Integer> integers;

    NumberGenerableTestImpl(Set<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public Set<Integer> getRandomNumbersSet() {
        return integers;
    }
}
