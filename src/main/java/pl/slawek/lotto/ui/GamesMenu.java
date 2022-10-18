package pl.slawek.lotto.ui;

import java.util.Set;
import pl.slawek.lotto.configuration.LottoConfiguration;
import pl.slawek.lotto.inputFromUser.InputData;
import pl.slawek.lotto.logic.GameResult;
import pl.slawek.lotto.logic.HitCounter;
import pl.slawek.lotto.logic.NumberGenerable;
import pl.slawek.lotto.logic.WinDecision;
import pl.slawek.lotto.messages.MessageDisplayer;
import pl.slawek.lotto.messages.Messages;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.DecisionChecker.whatDecisionIs;

public class GamesMenu {
    public final String PLAY_LOTTO = "1";
    public final String EXIT = "0";
    private final Scanner scanner;
    private final HitCounter hitCounter = new HitCounter();
    private final WinDecision winDecision = new WinDecision();
    private final InputData inputUserData = new InputData();
    private final NumberGenerable randomNumbers;
    private final MessageDisplayer messageDisplayer = new MessageDisplayer();

    public GamesMenu(Scanner scanner, NumberGenerable randomNumbers) {
        this.scanner = scanner;
        this.randomNumbers = randomNumbers;
    }

    private boolean wantToPlay = true;
    private String userDecision;

    public GameResult start() {

        while (wantToPlay) {
            messageDisplayer.displayWelcomeMessage();
            userDecision = scanner.next();

            switch (userDecision) {
                case PLAY_LOTTO -> {
                    System.out.println(Messages.LOTTO_INTRODUCTION_MESSAGE);
                    System.out.println(Messages.LOTTO_GAME_RULES);
                    return playLotto();
                }
                case EXIT -> {
                    System.out.println(Messages.END_PROGRAM_MESSAGE);
                    return exit();
                }
                default -> {
                    System.out.println(Messages.CHOSEN_WRONG_OPTION_MESSAGE);
                    System.out.println(Messages.FREE_SPACE_CREATOR);
                }
//                    wantToPlay = whatDecisionIs(scanner.next());
            }

////            if (userDecision.equals("1")) {
////                return playLotto();
//////                userNumbers.clear();
//////                System.out.println(Messages.WANT_PLAY_AGAIN);
//////                wantToPlay = whatDecisionIs(scanner.next());
//////                continue;
////
////            }
//            if (userDecision.equals("0")) {
//                return exit();
//            }
////            if (!userDecision.equals("0") || !userDecision.equals("1")) {
////                System.out.println(Messages.CHOSEN_WRONG_OPTION_MESSAGE);
////                System.out.println(Messages.FREE_SPACE_CREATOR);
////
////            }
        }
        return new GameResult("to test");
    }

    private static GameResult exit() {
        return new GameResult(Messages.END_PROGRAM_MESSAGE);
    }

    private GameResult playLotto() {
        Set<Integer> userNumbers = inputUserData.getNumbers(scanner);
        Set<Integer> drawn = randomNumbers.getRandomNumbersSet();
        int hitResult = hitCounter.howManyHits(userNumbers, drawn);
        return winDecision.decideAboutWin(hitResult, LottoConfiguration.LIMIT);
    }


}

