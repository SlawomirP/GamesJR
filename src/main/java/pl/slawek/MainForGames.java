package pl.slawek;


import java.util.Scanner;
import pl.slawek.lotto.logic.NumberGenerable;
import pl.slawek.lotto.logic.RandomNumbersSet;
import pl.slawek.lotto.ui.GamesMenu;

public class MainForGames {
    public static void main(String[] args) {
        NumberGenerable randomNumbersSet = new RandomNumbersSet();
        Scanner scanner = new Scanner(System.in);
        GamesMenu gamesMenu = new GamesMenu(scanner, randomNumbersSet);
        gamesMenu.start();
    }
}
