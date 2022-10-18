package pl.slawek.lotto.ui;

public enum GamesMenuOption {

    PLAY_LOTTO("1"),
    EXIT("0");

    final String option;

    GamesMenuOption(String option) {
        this.option = option;
    }
}
