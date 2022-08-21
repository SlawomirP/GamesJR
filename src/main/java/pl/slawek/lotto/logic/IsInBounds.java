package pl.slawek.lotto.logic;

public class IsInBounds {
    private final static int LOWER_BOUND = 1;
    private final static int UPPER_BOUND = 99;

    public static boolean isInBounds(int number) {
        return number >= LOWER_BOUND && number <= UPPER_BOUND;
    }
}
