package pl.slawek.lotto.logic;

import java.util.Set;

public class HitNumbersCounter {
    int howManyHitNumbers(Set<Integer> firstSet, Set<Integer> secondSet) {
        int hitsCounter = 0;
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                hitsCounter++;
            }
        }
        return hitsCounter;
    }
}
