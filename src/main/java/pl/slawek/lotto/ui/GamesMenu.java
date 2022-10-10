package pl.slawek.lotto.ui;

import pl.slawek.lotto.logic.HitNumbersCounter;
import pl.slawek.lotto.messages.Messages;
import pl.slawek.lotto.logic.RandomSetCreator;
import pl.slawek.lotto.logic.SetCreator;
import pl.slawek.lotto.logic.WinningDecision;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.DecisionChecker.whatDecisionIs;
import static pl.slawek.lotto.logic.IsInBounds.isInBounds;

public class GamesMenu {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final SetCreator userNumbers = new SetCreator();
    private static final RandomSetCreator RANDOM_SET_CREATOR = new RandomSetCreator();
    private static final HashSet<Integer> RANDOM_COMPUTER_NUMBERS = RANDOM_SET_CREATOR.getRandomNumbersSet();
    private static final HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private static final WinningDecision WINNING_DECISION = new WinningDecision();

    //    private static final Messages MESSAGE = new Messages();
    private final static int LIMIT = 6;


    public GamesMenu() {
    }

    private boolean wantToPlay = true;
    private int userNumber = 0;
    private String userDecision;

    public void start() {
        while (wantToPlay) {
            System.out.println(Messages.INTRODUCTION_MESSAGE);
            System.out.println(Messages.GAMES_MENU_MESSAGE);

            userDecision = SCANNER.next();

            if (userDecision.equals("1")) {
                System.out.println(Messages.LOTTO_INTRODUCTION_MESSAGE);
                System.out.println(Messages.LOTTO_GAME_RULES);

                do {
                    if (SCANNER.hasNextInt()) {
                        userNumber = SCANNER.nextInt();
                    } else {
                        System.out.println(Messages.WRONG_INPUT_TYPE_MESSAGE);
                        SCANNER.next();
                        continue;
                    }
                    if (isInBounds(userNumber)) {
                        userNumbers.addToSet(userNumber);
                    } else {
                        System.out.println(Messages.LOTTO_GAME_OUT_OF_BOUND_MESSAGE);
                    }
                } while (userNumbers.getSize() != LIMIT);

                WINNING_DECISION.decisionAboutWin(HIT_NUMBERS_COUNTER.howManyHitNumbers(userNumbers.getSet(), RANDOM_COMPUTER_NUMBERS), LIMIT);

                userNumbers.cleanSet();

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
