package duke.exception;

public class DukeInvalidArgumentException extends DukeException {
    @Override
    public String toString() {
        return String.format("%s You have invalid argument(s) for this command!", super.toString());
    }
}
