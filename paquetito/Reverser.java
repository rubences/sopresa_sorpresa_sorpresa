class Reverser {
    private HaltChecker haltChecker;

    public Reverser(HaltChecker haltChecker) {
        this.haltChecker = haltChecker;
    }

    public void run(Program program) {
        if (haltChecker.willHalt(program)) {
            while (true) {
                // Infinite loop
            }
        } else {
            System.out.println("Program will not halt.");
        }
    }
}