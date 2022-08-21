package pl.slawek.lotto.logic;

public class WinningDecision {

    public void decisionAboutWin(int hitResult, int limit) {
        if (hitResult == limit) {
            System.out.println("Great !!! You are the WINNER !!!");
        } else {
            System.out.println("Your result is " + hitResult + "/" + limit +"\nDon't worry, you can try again.");
        }
    }
}
