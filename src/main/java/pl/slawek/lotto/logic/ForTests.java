package pl.slawek.lotto.logic;

public class ForTests {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        int nowy = randomNumberGenerator.inputNumber(5,10);


        for (int i = 1; i < 20; i++){
            System.out.print(new RandomNumberGenerator().inputNumber(5,10) + "--");
        }
    }

}
