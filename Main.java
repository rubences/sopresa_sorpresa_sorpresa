public class Main {
    public static void main(String[] args) {
        ProgramFactory countDownFactory = new CountDownFactory(10);
        Program countDown = countDownFactory.createProgram();
        countDown.run();

        ProgramFactory countUpFactory = new CountUpFactory();
        Program countUp = countUpFactory.createProgram();
        countUp.run();
    }
}



