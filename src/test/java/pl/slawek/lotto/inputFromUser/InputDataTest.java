package pl.slawek.lotto.inputFromUser;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;

@ExtendWith(MockitoExtension.class)
class InputDataTest {

    @InjectMocks
    private InputData inputData;


    @Test
    void getNumbersMethodShouldReturnCorrectSizeSetAfterInputSixDifferentNumbers() {

        //given
        Scanner scanner = mockScannerIn("1 2 3 4 5 6");

        //when
        HashSet<Integer> result = inputData.getNumbers(scanner);

        //then
        assertThat(result, hasSize(6));
    }

    @Test
    void getNumbersMethodShouldReturnCorrectSetAfterInputSixDifferentNumbers() {

        //given
        Scanner scanner = mockScannerIn("1 2 3 4 5 6");

        //when
        HashSet<Integer> result = inputData.getNumbers(scanner);

        //then
        assertThat(result, contains(1,2,3,4,5,6));
    }

    @Test
    void getNumbersMethodShouldReturnCorrectSetAfterInputSevenDifferentNumbers() {

        //given
        Scanner scanner = mockScannerIn("1 2 3 4 5 6 7");

        //when
        HashSet<Integer> result = inputData.getNumbers(scanner);

        //then
        assertThat(result, contains(1,2,3,4,5,6));
    }

    @Test
    void getNumbersMethodShouldReturnCorrectSetAfterInputAFewNumbersOutOfRange() {

        //given
        Scanner scanner = mockScannerIn("-1 1 2 3 -4 4 5 6 120");

        //when
        HashSet<Integer> result = inputData.getNumbers(scanner);

        //then
        assertThat(result, contains(1,2,3,4,5,6));
    }

    @Test
    void getNumbersMethodShouldReturnCorrectSetAfterInputAFewDifferentDataTypes() {

        //given
        Scanner scanner = mockScannerIn("a 1 2 B 3 4 ; 5 6 @");

        //when
        HashSet<Integer> result = inputData.getNumbers(scanner);

        //then
        assertThat(result, contains(1,2,3,4,5,6));
    }

    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }

}