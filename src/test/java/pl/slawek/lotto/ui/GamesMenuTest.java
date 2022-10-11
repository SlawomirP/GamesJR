package pl.slawek.lotto.ui;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.slawek.lotto.inputFromUser.InputData;
import pl.slawek.lotto.logic.HitCounter;
import pl.slawek.lotto.logic.RandomNumbersSet;
import pl.slawek.lotto.logic.SetsForTests;
import pl.slawek.lotto.logic.WinDecision;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)

class GamesMenuTest {

    @InjectMocks
    private static final GamesMenu GAMES_MENU = new GamesMenu();

    @Mock
    private static final HitCounter HIT_COUNTER = new HitCounter();
    @Mock
    private static final WinDecision WIN_DECISION = new WinDecision();
    @Mock
    private static final InputData INPUT_DATA = new InputData();
    @Mock
    private static final RandomNumbersSet RANDOM_NUMBERS = new RandomNumbersSet();

    private static final SetsForTests SETS_FOR_TESTS = new SetsForTests();

    @Test
    void startMethod() {

        //given
        Scanner scanner = mockScannerIn("1 2 3 4 5 6");
        HashSet<Integer> userNumber = INPUT_DATA.getNumbers(scanner);

        given(RANDOM_NUMBERS.getRandomNumbersSet()).willReturn(SETS_FOR_TESTS.basicNumberSet());
        given(userDecision.equals("1")).willReturn(true);



    }



    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}