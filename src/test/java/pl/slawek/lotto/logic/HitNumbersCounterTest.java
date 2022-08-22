package pl.slawek.lotto.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HitNumbersCounterTest {

    private final static HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private final static SetsForTests SETS = new SetsForTests();


    @Test
    public void howManyHitNumbers_TwoDifferentSets_Zero() {
        //given

        //when
        int result = HIT_NUMBERS_COUNTER.howManyHitNumbers(SETS.basicNumberSet(), SETS.noTheSameNumbersAsBasic());
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void howManyHitNumbers_TwoTheSameSets_Six() {
        //given

        //when
        int result = HIT_NUMBERS_COUNTER.howManyHitNumbers(SETS.basicNumberSet(), SETS.allTheSameNumberaAsBasic());
        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    public void howManyHitNumbers_ThreeTheSameNumbersInSets_Three() {
        //given

        //when
        int result = HIT_NUMBERS_COUNTER.howManyHitNumbers(SETS.basicNumberSet(), SETS.threeTheSameNumbersAsBasic());
        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void howManyHitNumbers_OneTheSameNumberInSets_Zero() {
        //given

        //when
        int result = HIT_NUMBERS_COUNTER.howManyHitNumbers(SETS.basicNumberSet(), SETS.oneTheSameNumberAsBasic());
        //then
        Assertions.assertEquals(1, result);
    }


}