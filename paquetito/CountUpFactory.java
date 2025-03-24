public class CountUpFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new CountUp();
    }
}
