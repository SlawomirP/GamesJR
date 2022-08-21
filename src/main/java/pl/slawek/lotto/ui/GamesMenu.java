package pl.slawek.lotto.ui;

import pl.slawek.lotto.logic.Messages;
import pl.slawek.lotto.logic.HitNumbersCounter;
import pl.slawek.lotto.logic.RandomSetCreator;
import pl.slawek.lotto.logic.SetCreator;
import pl.slawek.lotto.logic.WinningDecision;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.IsInBounds.isInBounds;

public class GamesMenu {
    private final Scanner scanner;
    private final static RandomSetCreator RANDOM_SET_CREATOR = new RandomSetCreator();
    private final static HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private final static WinningDecision WINNING_DECISION = new WinningDecision();
    private final static HashSet<Integer> randomNumbersSet = RANDOM_SET_CREATOR.getRandomNumbersSet();
    private final static Messages message = new Messages();
    private final static int LIMIT = 6;
    private final static int LOWER_BOUND = 1;
    private final static int UPPER_BOUND = 99;
    private final SetCreator userNumbers;


    public GamesMenu() {
        this.scanner = new Scanner(System.in);
        this.userNumbers = new SetCreator();
    }

    public void start() {
        while (true) {
            message.introductionMessage();
            message.gamesMenuMessage();
            String userDecision = scanner.nextLine();

            if (userDecision.equals("0")) {
                break;
            }

            if (userDecision.equals("1")) {

                System.out.println(randomNumbersSet);

                message.lottoGameIntroductionMessage();
                message.lottoGameRulesMessage();

                while (userNumbers.getSize() != LIMIT) {
                    int numberFromUser = Integer.parseInt(scanner.nextLine());
                    if (isInBounds(numberFromUser)) {
                        userNumbers.addToSet(numberFromUser);
                    }else {
                        message.lottoGameOutOfBoundMessage();
                    }
                }

//                System.out.println(userNumbers.getSet());
                int hitsCounter = HIT_NUMBERS_COUNTER.howManyHitNumbers(randomNumbersSet,userNumbers.getSet());
                WINNING_DECISION.decisionAboutWin(hitsCounter, LIMIT);


            }

        }
    }


}
