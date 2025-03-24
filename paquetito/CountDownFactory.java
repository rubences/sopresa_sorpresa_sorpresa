public class CountDownFactory implements ProgramFactory {
    private int start;

    public CountDownFactory(int start) {
        this.start = start;
    }

    @Override
    public Program createProgram() {
        return new CountDown(start);
    }
}