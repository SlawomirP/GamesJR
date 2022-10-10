package pl.slawek.lotto.ui;

import pl.slawek.lotto.configuration.LottoConfiguration;
import pl.slawek.lotto.inputFromUser.InputData;
import pl.slawek.lotto.logic.HitCounter;
import pl.slawek.lotto.logic.RandomNumbersSet;
import pl.slawek.lotto.logic.WinDecision;
import pl.slawek.lotto.messages.Messages;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.DecisionChecker.whatDecisionIs;

public class GamesMenu {
    private final Scanner SCANNER = new Scanner(System.in);
    private final HitCounter hitCounter = new HitCounter();
    private final WinDecision winDecision = new WinDecision();
    private final InputData inputUserData = new InputData();
    private final RandomNumbersSet randomNumbers = new RandomNumbersSet();

    public GamesMenu() {
    }

    private boolean wantToPlay = true;
    private String userDecision;

    public void start() {
        while (wantToPlay) {

            System.out.println(Messages.INTRODUCTION_MESSAGE);
            System.out.println(Messages.GAMES_MENU_MESSAGE);

            userDecision = SCANNER.next();

            if (userDecision.equals("1")) {

                System.out.println(Messages.LOTTO_INTRODUCTION_MESSAGE);
                System.out.println(Messages.LOTTO_GAME_RULES);

                HashSet<Integer> userNumbers = inputUserData.getNumbers();
                HashSet<Integer> drawn = randomNumbers.getRandomNumbersSet();

                winDecision.decisionAboutWin(hitCounter.howManyHits(userNumbers, drawn), LottoConfiguration.LIMIT);
                userNumbers.clear();

                System.out.println(Messages.WANT_PLAY_AGAIN);
                wantToPlay = whatDecisionIs(SCANNER.next());
                continue;
            }
            if (userDecision.equals("0")) {
                System.out.println(Messages.END_PROGRAM_MESSAGE);
                break;
            }
            if (!userDecision.equals("0") || !userDecision.equals("1")) {
                System.out.println(Messages.CHOSEN_WRONG_OPTION_MESSAGE);
                System.out.println(Messages.FREE_SPACE_CREATOR);
            }
        }
    }
}

