package pl.slawek.lotto.logic;

import java.util.HashSet;
import java.util.Scanner;

public class UserSetCreator {
    private HashSet<Integer> set;
    private final Scanner SCANNER;

    public UserSetCreator() {
        this.set = new HashSet<>();
        this.SCANNER = new Scanner(System.in);
    }

    void addToSet(int number) {
        this.set.add(number);
    }

    int setSize() {
        return this.set.size();
    }
}
