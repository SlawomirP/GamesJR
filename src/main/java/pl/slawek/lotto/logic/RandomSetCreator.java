package pl.slawek.lotto.logic;

import java.util.HashSet;

public class RandomSetCreator {
    private final int LOWER_BOUND = 1;
    private final int UPPER_BOUND = 99;
    private HashSet<Integer> set;
    private RandomNumberGenerator randomNumberGenerator;

    public RandomSetCreator() {
        this.set = new HashSet<>();
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    HashSet<Integer> getRandomNumbersSet(){
        while(this.set.size() != 6){
            int randomNumber = randomNumberGenerator.inputNumber(LOWER_BOUND,UPPER_BOUND);
            this.set.add(randomNumber);
        }
        return this.set;
    }
}
