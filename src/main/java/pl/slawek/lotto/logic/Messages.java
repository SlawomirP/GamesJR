package pl.slawek.lotto.logic;

public class Messages {

    public void introductionMessage() {
        System.out.println("Welcome, please choose your game number.");
    }

    public void gamesMenuMessage() {
        System.out.println("1 - Lotto\n" +
                "0 - End the program");
    }

    public void lottoGameIntroductionMessage() {
        System.out.println("Hello !!! You have chosen Lotto.\n");
    }

    public void endProgramMessage(){
        System.out.println("Bye Bye");
    }
    public void lottoGameRulesMessage() {
        System.out.println("You have to choose 6 numbers from range 1 to 99.\n" +
                "You can't repeat the numbers and use different type of data.\n" +
                "Press ENTER after input every single number.");
    }
    public void lottoGameOutOfBoundMessage(){
        System.out.println("Yours number should be between 1 and 99.\nPlease correct yourself.");
    }

    public void chosenWrongOptionMessage(){
        System.out.println("Please, choose correct option.");
    }
    public void wantPlayAgain(){
        System.out.println("Do you want play again ?? y/n");
    }
    public void wrongInputTypeMessage(){
        System.out.println("You use not this type of data. Write number");
    }
}
