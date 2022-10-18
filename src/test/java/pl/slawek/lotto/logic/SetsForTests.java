package pl.slawek.lotto.logic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsForTests {

    public Set<Integer> basicNumberSet() {
        return new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    public Set<Integer> noTheSameNumbersAsBasic() {
        return new HashSet<>(Arrays.asList(7, 8, 9, 10, 11, 12));
    }

    public Set<Integer> oneTheSameNumberAsBasic() {
        return new HashSet<>(Arrays.asList(13, 14, 3, 15, 16, 17));
    }

    public Set<Integer> threeTheSameNumbersAsBasic() {
        return new HashSet<>(Arrays.asList(1, 18, 2, 19, 20, 3));
    }

    public Set<Integer> allTheSameNumberaAsBasic() {
        return new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }


}
