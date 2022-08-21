package pl.slawek.lotto.logic;

import java.util.HashSet;

public class SetCreator{
    private HashSet<Integer> set;

    public SetCreator() {
        this.set = new HashSet<>();
    }

    public void addToSet(int number) {
        this.set.add(number);
    }

    public int getSize() {
        return this.set.size();
    }

    public HashSet<Integer> getSet(){
        return this.set;
    }

    public boolean contains(int number){
        return this.set.contains(number);
    }

    public void printSet(){
        for(Integer number: this.set){
            System.out.println(number);
        }
    }
}
