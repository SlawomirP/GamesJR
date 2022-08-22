package pl.slawek.lotto.ui;

import pl.slawek.lotto.logic.HitNumbersCounter;
import pl.slawek.lotto.logic.Messages;
import pl.slawek.lotto.logic.RandomSetCreator;
import pl.slawek.lotto.logic.SetCreator;
import pl.slawek.lotto.logic.WinningDecision;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.DecisionChecker.whatDecisionIs;

public class GamesMenu {
    private final Scanner scanner;
    private SetCreator userNumbers = new SetCreator();
    private static RandomSetCreator RANDOM_SET_CREATOR = new RandomSetCreator();
    private HashSet<Integer> randomComputerNumbers = RANDOM_SET_CREATOR.getRandomNumbersSet();
    private final static HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private final static WinningDecision WINNING_DECISION = new WinningDecision();

    private final static Messages message = new Messages();
    private final static int LIMIT = 6;
    //    private final static int LOWER_BOUND = 1;
//    private final static int UPPER_BOUND = 99;
    private static boolean wantToPlay = true;
    private int userNumber = 0;


    public GamesMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (wantToPlay) {
            message.introductionMessage();
            message.gamesMenuMessage();

            String userDecision = scanner.next();

            if (userDecision.equals("1")) {

                message.lottoGameIntroductionMessage();
                message.lottoGameRulesMessage();

                System.out.println("---" + randomComputerNumbers);

                do {
                    if (scanner.hasNextInt()) {
                        userNumber = scanner.nextInt();
                    } else {
                        message.wrongInputTypeMessage();
                        scanner.next();
                        continue;
                    }
                    userNumbers.addToSet(userNumber);
                } while (userNumbers.getSize() != LIMIT);

                int hit = HIT_NUMBERS_COUNTER.howManyHitNumbers(userNumbers.getSet(), randomComputerNumbers);
                WINNING_DECISION.decisionAboutWin(hit, LIMIT);

                System.out.println("-----" + userNumbers.getSet());


                userNumbers.cleanSet();
                message.wantPlayAgain();
            wantToPlay = whatDecisionIs(scanner.next());
            }

            if (userDecision.equals("0")) {
                message.endProgramMessage();
                break;
            }


//
        }
    }
}
