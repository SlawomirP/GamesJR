package pl.slawek.lotto.logic;

import java.util.Set;


public class HitCounter {
    public int howManyHits(Set<Integer> user, Set<Integer> drawn) {
        int hitsCounter = 0;
        for (Integer number : user) {
            if (drawn.contains(number)) {
                hitsCounter++;
            }
        }
        return hitsCounter;
    }
}
