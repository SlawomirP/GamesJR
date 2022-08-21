package pl.slawek.lotto.logic;

import java.util.HashSet;

public class ForTests {
    public static void main(String[] args) {

        RandomSetCreator randomSetCreator = new RandomSetCreator();

        HashSet<Integer> randomy = randomSetCreator.getRandomNumbersSet();

        System.out.println(randomy);


    }
}
