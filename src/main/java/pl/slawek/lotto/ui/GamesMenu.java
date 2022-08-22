package pl.slawek.lotto.ui;

import pl.slawek.lotto.logic.HitNumbersCounter;
import pl.slawek.lotto.logic.Messages;
import pl.slawek.lotto.logic.RandomSetCreator;
import pl.slawek.lotto.logic.SetCreator;
import pl.slawek.lotto.logic.WinningDecision;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.DecisionChecker.whatDecisionIs;
import static pl.slawek.lotto.logic.IsInBounds.isInBounds;

public class GamesMenu {
    private final Scanner scanner = new Scanner(System.in);
    private SetCreator userNumbers = new SetCreator();
    private final static RandomSetCreator RANDOM_SET_CREATOR = new RandomSetCreator();
    private HashSet<Integer> randomComputerNumbers = RANDOM_SET_CREATOR.getRandomNumbersSet();
    private final static HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private final static WinningDecision WINNING_DECISION = new WinningDecision();

    private final static Messages message = new Messages();
    private final static int LIMIT = 6;

    private static boolean wantToPlay = true;
    private int userNumber = 0;


    public GamesMenu() {
    }

    public void start() {
        while (wantToPlay) {
            message.introductionMessage();
            message.gamesMenuMessage();

            String userDecision = scanner.next();

            if (userDecision.equals("1")) {
                message.lottoGameIntroductionMessage();
                message.lottoGameRulesMessage();

                do {
                    if (scanner.hasNextInt()) {
                        userNumber = scanner.nextInt();
                    } else {
                        message.wrongInputTypeMessage();
                        scanner.next();
                        continue;
                    }
                    if (isInBounds(userNumber)) {
                        userNumbers.addToSet(userNumber);
                    } else {
                        message.lottoGameOutOfBoundMessage();
                    }
                } while (userNumbers.getSize() != LIMIT);

                WINNING_DECISION.decisionAboutWin(HIT_NUMBERS_COUNTER.howManyHitNumbers(userNumbers.getSet(), randomComputerNumbers), LIMIT);

                userNumbers.cleanSet();

                message.wantPlayAgain();
                wantToPlay = whatDecisionIs(scanner.next());
                continue;
            }
            if (userDecision.equals("0")) {
                message.endProgramMessage();
                break;
            }
            if (!userDecision.equals("0") || !userDecision.equals("1")) {
                message.chosenWrongOptionMessage();
                message.freeSpaceCreator(1);
            }
        }
    }
}
