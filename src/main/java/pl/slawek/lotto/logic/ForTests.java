package pl.slawek.lotto.logic;

import java.util.HashSet;

public class ForTests {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomSetCreator randomSetCreator = new RandomSetCreator();

        HashSet<Integer> test = randomSetCreator.getRandomNumbersSet();

        System.out.println(test);






    }

}
