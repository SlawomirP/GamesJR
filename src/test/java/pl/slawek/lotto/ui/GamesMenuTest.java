package pl.slawek.lotto.ui;

import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.slawek.lotto.inputFromUser.InputData;
import pl.slawek.lotto.logic.GameResult;
import pl.slawek.lotto.logic.HitCounter;
import pl.slawek.lotto.logic.NumberGenerable;
import pl.slawek.lotto.logic.SetsForTests;
import pl.slawek.lotto.logic.WinDecision;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import pl.slawek.lotto.messages.Messages;
import static java.util.Set.of;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class GamesMenuTest {


//    @Mock
//    private static final HitCounter HIT_COUNTER = new HitCounter();
//    @Mock
//    private static final WinDecision WIN_DECISION = new WinDecision();
//    @Mock
//    private static final InputData INPUT_DATA = new InputData();

//    private static final NumberGenerable RANDOM_NUMBERS = new NumberGenerableTestImpl();

//    private static final SetsForTests SETS_FOR_TESTS = new SetsForTests();
//
//    @InjectMocks
//    private static final GamesMenu GAMES_MENU = new GamesMenu(RANDOM_NUMBERS);

    @Test
    void should_return_success_when_user_gave_six_numbers_in_range_of_1_to_99() {
        // given
        Scanner scanner = mockScannerIn("1 2 3 4 5 6 8");
//        HashSet<Integer> userNumber = INPUT_DATA.getNumbers(scanner);
        NumberGenerable randomGenerator = new NumberGenerableTestImpl(of(1, 2, 3, 4, 5, 6, 8));
        GamesMenu gamesMenu = new GamesMenu(scanner, randomGenerator);

        // when
        GameResult start = gamesMenu.start();

        // then
        assertThat(start.message()).isEqualTo(Messages.WIN_MESSAGE);
    }


    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}
