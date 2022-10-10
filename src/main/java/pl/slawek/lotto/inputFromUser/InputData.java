package pl.slawek.lotto.inputFromUser;

import pl.slawek.lotto.configuration.LottoConfiguration;
import pl.slawek.lotto.messages.Messages;

import java.util.HashSet;
import java.util.Scanner;

import static pl.slawek.lotto.logic.IsInBounds.isInBounds;

public class InputData {

    private Scanner scanner = new Scanner(System.in);

    public HashSet<Integer> getNumbers() {
        HashSet<Integer> userNumbers = new HashSet<>();
        int userNumber;
        do {
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
            } else {
                System.out.println(Messages.WRONG_INPUT_TYPE_MESSAGE);
                scanner.next();
                continue;
            }
            if (isInBounds(userNumber)) {
                userNumbers.add(userNumber);
            } else {
                System.out.println(Messages.LOTTO_GAME_OUT_OF_BOUND_MESSAGE);
            }
        } while (userNumbers.size() != LottoConfiguration.LIMIT);
        return userNumbers;
    }
}
