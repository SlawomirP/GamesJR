package pl.slawek.lotto.logic;

import java.util.HashSet;
import java.util.Scanner;

public class SetCreator {
    private HashSet<Integer> set;
    private Scanner scanner;

    public SetCreator() {
        this.set = new HashSet<>();
        this.scanner = new Scanner(System.in);
    }

    void addToSet(int number){
        this.set.add(number);
    }

    int setSize(){
        return this.set.size();
    }
}
