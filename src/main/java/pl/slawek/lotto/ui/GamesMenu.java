package pl.slawek.lotto.ui;

import pl.slawek.lotto.logic.DecisionChecker;
import pl.slawek.lotto.logic.IsInBounds;
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
    private SetCreator userNumbers;
    private final static RandomSetCreator RANDOM_SET_CREATOR = new RandomSetCreator();
    private final static HitNumbersCounter HIT_NUMBERS_COUNTER = new HitNumbersCounter();
    private final static WinningDecision WINNING_DECISION = new WinningDecision();

    private final DecisionChecker decisionChecker = new DecisionChecker();
    private final static Messages message = new Messages();
    private final static int LIMIT = 6;
    private final static int LOWER_BOUND = 1;
    private final static int UPPER_BOUND = 99;
    private boolean wantToPlay = true;



    public GamesMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (wantToPlay) {

            message.introductionMessage();
            message.gamesMenuMessage();

            String userDecision = scanner.nextLine();

            if(userDecision.equals("1")){
                HashSet<Integer> randomComputerNumbers = RANDOM_SET_CREATOR.getRandomNumbersSet();
                userNumbers = new SetCreator();

                message.lottoGameIntroductionMessage();
                message.lottoGameRulesMessage();

                int userInput = scanner.nextInt();
                if(isInBounds(userInput)){
                    userNumbers.addToSet(userInput);
                } else {

                }





                message.wantPlayAgain();
                wantToPlay = decisionChecker.whatDecisionIs(scanner.nextLine());

            }else if(userDecision.equals("0")){
                message.endProgramMessage();
                break;
            }else {
                message.chosenWrongOptionMessage();
            }

            message.endProgramMessage();

        }
    }


}
