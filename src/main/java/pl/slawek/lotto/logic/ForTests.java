package pl.slawek.lotto.logic;

import java.util.HashSet;

public class ForTests {
    public static void main(String[] args) {


        HitNumbersCounter hitNumbersCounter = new HitNumbersCounter();

        HashSet<Integer> test = new RandomSetCreator().getRandomNumbersSet();
        HashSet<Integer> test2 = new RandomSetCreator().getRandomNumbersSet();

        System.out.println(test);
        System.out.println(test2);

        System.out.println(hitNumbersCounter.howManyHitNumbers(test, test2));


    }

}
