package pl.slawek.lotto.logic;

import pl.slawek.lotto.messages.Messages;

public class WinDecision {

    public void decisionAboutWin(int hitResult, int limit) {
        if (hitResult == limit) {
            System.out.println(Messages.WIN_MESSAGE);
        } else {
            System.out.println(hitResult + "/" + limit + "\n" + Messages.LOSE_MESSAGE);
        }
    }

}
