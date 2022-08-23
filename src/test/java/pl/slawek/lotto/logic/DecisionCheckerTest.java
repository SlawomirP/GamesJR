package pl.slawek.lotto.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecisionCheckerTest {

    @Test

    public void whatDecisionIs_String_y_True() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("y");
        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void whatDecisionIs_String_Y_True() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("Y");
        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void whatDecisionIs_String_N_False() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("N");
        //then
        Assertions.assertEquals(false, result);
    }

    @Test
    public void whatDecisionIs_String_n_False() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("n");
        //then
        Assertions.assertEquals(false, result);
    }

    @Test
    public void whatDecisionIs_String_Yy_False() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("Yy");
        //then
        Assertions.assertEquals(false, result);
    }

    @Test
    public void whatDecisionIs_Empty_False() {
        //given
        new DecisionChecker();
        //when
        Boolean result = DecisionChecker.whatDecisionIs("");
        //then
        Assertions.assertEquals(false, result);
    }


}