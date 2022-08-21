package pl.slawek.lotto.logic;

import java.util.HashSet;

public class RandomSetCreator {
    private final static int LIMIT = 6;
    private final int LOWER_BOUND = 1;
    private final int UPPER_BOUND = 99;

    private HashSet<Integer> set = new HashSet<>();
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public RandomSetCreator() {
    }

    public HashSet<Integer> getRandomNumbersSet() {
        while (this.set.size() != LIMIT) {
            this.set.add(randomNumberGenerator.inputNumber(LOWER_BOUND, UPPER_BOUND));
        }
        return this.set;
    }

    public void printSet(){
        for(Integer number: this.set){
            System.out.println(number);
        }
    }
}
