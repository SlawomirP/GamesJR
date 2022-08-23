package pl.slawek.lotto.logic;

import java.util.Arrays;
import java.util.HashSet;

public class SetsForTests {

    public HashSet<Integer> basicNumberSet() {
        return new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    public HashSet<Integer> noTheSameNumbersAsBasic() {
        return new HashSet<>(Arrays.asList(7, 8, 9, 10, 11, 12));
    }

    public HashSet<Integer> oneTheSameNumberAsBasic() {
        return new HashSet<>(Arrays.asList(13, 14, 3, 15, 16, 17));
    }

    public HashSet<Integer> threeTheSameNumbersAsBasic() {
        return new HashSet<>(Arrays.asList(1, 18, 2, 19, 20, 3));
    }

    public HashSet<Integer> allTheSameNumberaAsBasic() {
        return new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }


}
