package pl.slawek.lotto.logic;

import java.util.HashSet;


public class HitNumbersCounter {
    public int howManyHitNumbers(HashSet<Integer> firstSet, HashSet<Integer> secondSet) {
        int hitsCounter = 0;
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                hitsCounter++;
            }
        }
        return hitsCounter;
    }
}
