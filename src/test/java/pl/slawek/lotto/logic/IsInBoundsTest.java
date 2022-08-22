package pl.slawek.lotto.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsInBoundsTest {

    @Test
    public void isInBounds_NumberBelowLowerBound_False() {
        //given

        //when
        boolean result = IsInBounds.isInBounds(0);
        //then
        Assertions.assertEquals(false, result);
    }

    @Test
    public void isInBounds_NumberEqualsLowerBound_True() {
        //given

        //when
        boolean result = IsInBounds.isInBounds(1);
        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isInBounds_NumberBetweenBounds_True() {
        //given

        //when
        boolean result = IsInBounds.isInBounds(47);
        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isInBounds_NumberEqualsUpperBound_True() {
        //given

        //when
        boolean result = IsInBounds.isInBounds(99);
        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isInBounds_NumberOverUpperBound_True() {
        //given

        //when
        boolean result = IsInBounds.isInBounds(100);
        //then
        Assertions.assertEquals(false, result);
    }
}